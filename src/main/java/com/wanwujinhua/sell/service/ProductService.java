package com.wanwujinhua.sell.service;

import com.wanwujinhua.sell.dataobject.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @desc ：商品服务
 * @auth ：pdp
 * @date ：Created in 2019/3/14 19:58
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * @desc : 查询所有上架商品
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存
}
