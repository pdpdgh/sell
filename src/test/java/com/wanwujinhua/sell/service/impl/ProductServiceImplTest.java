package com.wanwujinhua.sell.service.impl;

import com.wanwujinhua.sell.dataobject.ProductInfo;
import com.wanwujinhua.sell.enums.ProductStatusEnum;
import com.wanwujinhua.sell.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("123456");
        Assert.assertEquals("123456", productInfo.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoList = productService.findUpAll();
        Assert.assertNotEquals(0, productInfoList.size());
    }

    @Test
    public void findAll() {
        PageRequest request = PageRequest.of(0, 2);
        Page<ProductInfo> productInfoPage = productService.findAll(request);
        //System.out.println(productInfoPage.getTotalElements());
        Assert.assertNotEquals(0, productInfoPage.getTotalElements());
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("55634");
        productInfo.setProductName("芒果冰55");
        productInfo.setProductPrice(new BigDecimal(8.0));
        productInfo.setProductStock(25);
        productInfo.setProductDescription("女生很爱");
        productInfo.setProductIcon("https://gss3.bdstatic.com/-Po3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike80%2C5%2C5%2C80%2C26/sign=57fcd535e1f81a4c323fe49bb6430b3c/4034970a304e251fce0583b9ad86c9177e3e5384.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(15);

        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void onSale() {
        ProductInfo result = productService.onSale("846799");
        Assert.assertEquals(ProductStatusEnum.UP, result.getProductStatusEnum());
    }

    @Test
    public void offSale() {
        ProductInfo result = productService.offSale("846799");
        Assert.assertEquals(ProductStatusEnum.DOWN, result.getProductStatusEnum());
    }
}