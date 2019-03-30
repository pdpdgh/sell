package com.wanwujinhua.sell.service;

import com.wanwujinhua.sell.dto.OrderDTO;

/**
 * @desc ：推送消息服务
 * @auth ：pdp
 * @date ：Created in 2019/3/30 13:22
 */
public interface PushMessageService {

    /**
     * @desc : 订单状态变更消息
     */
    void orderStatus(OrderDTO orderDTO);
}
