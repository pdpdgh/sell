package com.wanwujinhua.sell.enums;

import lombok.Getter;

/**
 * @desc ：商品状态enum
 * @auth ：pdp
 * @date ：Created in 2019/3/14 20:11
 */
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0, "上架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
