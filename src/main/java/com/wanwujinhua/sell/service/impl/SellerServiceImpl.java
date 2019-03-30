package com.wanwujinhua.sell.service.impl;

import com.wanwujinhua.sell.dataobject.SellerInfo;
import com.wanwujinhua.sell.repository.SellerInfoRepository;
import com.wanwujinhua.sell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @desc ：卖家服务impl
 * @auth ：pdp
 * @date ：Created in 2019/3/29 13:16
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {

        return repository.findByOpenid(openid);
    }
}
