package com.wanwujinhua.sell.service;

/**
 * @desc ：SecKillService
 * @auth ：pdp
 * @date ：Created in 2019/3/31 8:48
 */
public interface SecKillService {

    public String querySecKillProductInfo(String productId);

    public void orderProductMockDiffUser(String productId);
}
