package com.wanwujinhua.sell.dto;

import lombok.Data;

/**
 * @desc ：CartDTO
 * @auth ：pdp
 * @date ：Created in 2019/3/16 3:20
 */
@Data
public class CartDTO {

    /** @desc : 商品id */
    private String productId;

    /** @desc : 商品数量 */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
