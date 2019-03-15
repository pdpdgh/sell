package com.wanwujinhua.sell.dataobject;

import com.wanwujinhua.sell.enums.OrderStatusEnum;
import com.wanwujinhua.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @desc ：订单
 * @auth ：pdp
 * @date ：Created in 2019/3/15 15:23
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    /** @desc : 订单id */
    @Id
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
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /** @desc : 支付状态，默认为0未支付 */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /** @desc : 创建时间 */
    private Date createTime;

    /** @desc : 更新时间 */
    private Date updateTime;
}
