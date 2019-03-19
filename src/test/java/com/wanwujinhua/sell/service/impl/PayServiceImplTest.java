package com.wanwujinhua.sell.service.impl;

import com.wanwujinhua.sell.dto.OrderDTO;
import com.wanwujinhua.sell.service.OrderService;
import com.wanwujinhua.sell.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @desc ：支付服务impl测试
 * @auth ：pdp
 * @date ：Created in 2019/3/19 15:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PayServiceImplTest {

    @Autowired
    private PayService payService;

    @Autowired
    private OrderService orderService;

    @Test
    public void create() {
        OrderDTO orderDTO = orderService.findOne("1552682068265556036");
        payService.create(orderDTO);
    }
}