package com.wanwujinhua.sell.service;

import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundRequest;
import com.lly835.bestpay.model.RefundResponse;
import com.wanwujinhua.sell.dto.OrderDTO;

/**
 * @desc ：支付服务
 * @auth ：pdp
 * @date ：Created in 2019/3/19 15:46
 */
public interface PayService {

    PayResponse create(OrderDTO orderDTO);

    PayResponse notify(String notifyData);

    RefundResponse refund(OrderDTO orderDTO);
}
