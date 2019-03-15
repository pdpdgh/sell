package com.wanwujinhua.sell.dto;

import com.wanwujinhua.sell.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @desc ：订单dto
 * @auth ：pdp
 * @date ：Created in 2019/3/16 2:26
 */
@Data
public class OrderDTO {

    /** @desc : 订单id */
    private String orderId;

    /** @desc : 买家名字 */
    private String buyerName;

    /** @desc : 买家手机号 */
    private String buyerPhone;

    /** @desc : 买家地址 */
    private String buyerAddress;

    /** @desc : 买家微信openid */
    private String buyerOpenid;

    /** @desc : 订单总金额 */
    private BigDecimal orderAmount;

    /** @desc : 订单状态，默认为0新下单 */
    private Integer orderStatus;

    /** @desc : 支付状态，默认为0未支付 */
    private Integer payStatus;

    /** @desc : 创建时间 */
    private Date createTime;

    /** @desc : 更新时间 */
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
