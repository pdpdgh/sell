package com.wanwujinhua.sell.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * @desc ：http请求返回的最外层对象
 * @auth ：pdp
 * @date ：Created in 2019/3/15 0:20
 */
@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = -1723593814437217539L;

    /** @desc : 错误码 */
    private Integer code;

    /** @desc : 提示信息 */
    private String msg;
//    private String msg = "";

    /** @desc : 具体内容 */
    private T data;
}
