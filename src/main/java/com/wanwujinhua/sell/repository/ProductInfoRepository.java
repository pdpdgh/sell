package com.wanwujinhua.sell.repository;

import com.wanwujinhua.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @desc ：商品信息repo
 * @auth ：pdp
 * @date ：Created in 2019/3/14 19:03
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
