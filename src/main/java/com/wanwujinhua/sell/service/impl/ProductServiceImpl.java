package com.wanwujinhua.sell.service.impl;

import com.wanwujinhua.sell.dataobject.ProductInfo;
import com.wanwujinhua.sell.enums.ProductStatusEnum;
import com.wanwujinhua.sell.repository.ProductInfoRepository;
import com.wanwujinhua.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @desc ：商品服务impl
 * @auth ：pdp
 * @date ：Created in 2019/3/14 20:15
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo findOne(String productId) {
        return repository.findById(productId).orElse(null);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }
}
