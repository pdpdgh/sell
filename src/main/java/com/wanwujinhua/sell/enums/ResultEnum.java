package com.wanwujinhua.sell.enums;

import lombok.Getter;

/**
 * @desc ：ResultEnum
 * @auth ：pdp
 * @date ：Created in 2019/3/16 2:41
 */
@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(10, "商品不存在"),
    PRODUCT_STOCK_ERROR(11, "商品库存不正确"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }}
