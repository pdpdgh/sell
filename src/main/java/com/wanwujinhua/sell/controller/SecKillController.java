package com.wanwujinhua.sell.controller;

import com.wanwujinhua.sell.service.SecKillService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc ：SecKillController
 * @auth ：pdp
 * @date ：Created in 2019/3/31 8:34
 */
@RestController
@RequestMapping("/skill")
@Slf4j
public class SecKillController {

    @Autowired
    private SecKillService secKillService;

    /**
     * @desc : 查询秒杀活动特价商品的信息
     */
    @GetMapping("/query/{productId}")
    public String query(@PathVariable String productId) throws Exception {
        return secKillService.querySecKillProductInfo(productId);
    }

    /**
     * @desc : 秒杀，没有抢到获得“哎呦喂，xxxxx”，抢到了会返回剩余的库存量
     */
    @GetMapping("/order/{productId}")
    public String skill(@PathVariable String productId) throws Exception {
        log.info("@skill request, productId:" + productId);
        secKillService.orderProductMockDiffUser(productId);
        return secKillService.querySecKillProductInfo(productId);
    }
}
