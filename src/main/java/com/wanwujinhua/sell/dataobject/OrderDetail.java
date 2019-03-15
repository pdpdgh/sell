package com.wanwujinhua.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @desc ：订单详情
 * @auth ：pdp
 * @date ：Created in 2019/3/15 15:33
 */
@Entity
@Data
public class OrderDetail {

    /** @desc : 订单详情id */
    @Id
    private String detailId;

    /** @desc : 订单id */
    private String orderId;

    /** @desc : 商品id */
    private String productId;

    /** @desc : 商品名称 */
    private String productName;

    /** @desc : 商品单价 */
    private BigDecimal productPrice;

    /** @desc : 商品数量 */
    private Integer productQuantity;

    /** @desc : 商品小图 */
    private String productIcon;
}
