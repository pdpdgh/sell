package com.wanwujinhua.sell.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @desc ：订单表单
 * @auth ：pdp
 * @date ：Created in 2019/3/16 16:48
 */
@Data
public class OrderForm {

    /** @desc : 买家姓名 */
    @NotEmpty(message = "姓名必填")
    private String name;

    /** @desc : 买家手机号 */
    @NotEmpty(message = "手机号必填")
    private String phone;

    /** @desc : 买家地址 */
    @NotEmpty(message = "地址必填")
    private String address;

    /** @desc : 买家微信openid */
    @NotEmpty(message = "openid必填")
    private String openid;

    /** @desc : 购物车 */
    @NotEmpty(message = "购物车不能为空")
    private String items;
}
