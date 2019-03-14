package com.wanwujinhua.sell.service;

import com.wanwujinhua.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @desc ：商品类目服务
 * @auth ：pdp
 * @date ：Created in 2019/3/14 17:27
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
