package com.wanwujinhua.sell.enums;

import lombok.Getter;

/**
 * @desc ：支付状态enum
 * @auth ：pdp
 * @date ：Created in 2019/3/15 15:19
 */
@Getter
public enum PayStatusEnum implements CodeEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
