package com.wanwujinhua.sell.service.impl;

import com.wanwujinhua.sell.dto.OrderDTO;
import com.wanwujinhua.sell.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @desc ：推送消息服务impl测试
 * @auth ：pdp
 * @date ：Created in 2019/3/30 13:44
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PushMessageServiceImplTest {

    @Autowired
    private PushMessageServiceImpl pushMessageService;

    @Autowired
    private OrderService orderService;

    @Test
    public void orderStatus() {

        OrderDTO orderDTO = orderService.findOne("1553250387598211889");
        pushMessageService.orderStatus(orderDTO);
    }
}