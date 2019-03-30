package com.wanwujinhua.sell.service;

import com.wanwujinhua.sell.dataobject.SellerInfo;

/**
 * @desc ：卖家服务
 * @auth ：pdp
 * @date ：Created in 2019/3/29 13:14
 */
public interface SellerService {

    /**
     * @desc : 通过openid查询卖家端信息
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
