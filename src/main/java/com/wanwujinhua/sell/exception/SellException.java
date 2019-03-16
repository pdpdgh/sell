package com.wanwujinhua.sell.exception;

import com.wanwujinhua.sell.enums.ResultEnum;

/**
 * @desc ：SellException
 * @auth ：pdp
 * @date ：Created in 2019/3/16 2:45
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
