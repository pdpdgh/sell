package com.wanwujinhua.sell.service;

import com.wanwujinhua.sell.dto.OrderDTO;

/**
 * @desc ：买家服务
 * @auth ：pdp
 * @date ：Created in 2019/3/17 22:09
 */
public interface BuyerService {

    /**
     * @desc : 查询一个订单
     */
    OrderDTO findOrderOne(String openid, String orderId);

    /**
     * @desc : 取消订单
     */
    OrderDTO cancelOrder(String openid, String orderId);
}
