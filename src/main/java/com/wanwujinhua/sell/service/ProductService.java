package com.wanwujinhua.sell.service;

import com.wanwujinhua.sell.dataobject.ProductInfo;
import com.wanwujinhua.sell.dto.CartDTO;
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

    /**
     * @desc : 加库存
     */
    void increaseStock(List<CartDTO> cartDTOList);

    /**
     * @desc : 减库存
     */
    void decreaseStock(List<CartDTO> cartDTOList);
}
