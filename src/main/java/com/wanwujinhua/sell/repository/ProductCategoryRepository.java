package com.wanwujinhua.sell.repository;

import com.wanwujinhua.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @desc ：商品类目repo
 * @auth ：pdp
 * @date ：Created in 2019/3/14 14:47
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
