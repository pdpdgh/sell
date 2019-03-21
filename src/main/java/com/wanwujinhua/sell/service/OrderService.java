package com.wanwujinhua.sell.service;

import com.wanwujinhua.sell.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @desc ：订单服务
 * @auth ：pdp
 * @date ：Created in 2019/3/16 2:31
 */
public interface OrderService {

    /**
     * @desc : 创建订单
     */
    OrderDTO create(OrderDTO orderDTO);

    /**
     * @desc : 查询单个订单
     */
    OrderDTO findOne(String orderId);

    /**
     * @desc : 查询订单列表
     */
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    /**
     * @desc : 取消订单
     */
    OrderDTO cancel(OrderDTO orderDTO);

    /**
     * @desc : 完结订单
     */
    OrderDTO finish(OrderDTO orderDTO);

    /**
     * @desc : 支付订单
     */
    OrderDTO paid(OrderDTO orderDTO);

    /**
     * @desc : 查询订单列表
     */
    Page<OrderDTO> findList(Pageable pageable);
}
