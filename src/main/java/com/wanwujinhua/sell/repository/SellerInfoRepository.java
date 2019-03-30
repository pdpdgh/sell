package com.wanwujinhua.sell.repository;

import com.wanwujinhua.sell.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @desc ：卖家信息repo
 * @auth ：pdp
 * @date ：Created in 2019/3/29 12:52
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {

    SellerInfo findByOpenid(String openid);
}
