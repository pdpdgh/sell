package com.wanwujinhua.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @desc ：卖家信息
 * @auth ：pdp
 * @date ：Created in 2019/3/29 12:49
 */
@Data
@Entity
public class SellerInfo {

    @Id
    private String sellerId;

    private String username;

    private String password;

    private String openid;
}
