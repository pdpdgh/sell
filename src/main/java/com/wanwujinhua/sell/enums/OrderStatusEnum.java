package com.wanwujinhua.sell.enums;

import lombok.Getter;

/**
 * @desc ：订单状态enum
 * @auth ：pdp
 * @date ：Created in 2019/3/15 15:15
 */
@Getter
public enum OrderStatusEnum implements CodeEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
