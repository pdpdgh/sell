package com.wanwujinhua.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @desc ：WechatAccountConfig
 * @auth ：pdp
 * @date ：Created in 2019/3/19 4:08
 */
@Component
@Data
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {

    private String mpAppId;

    private String mpAppSecret;

    /** @desc : 商户号 */
    private String mchId;

    /** @desc : 商户秘钥 */
    private String mchKey;

    /** @desc : 商户证书路径 */
    private String keyPath;

    /** @desc : 微信支付异步通知地址 */
    private String notifyUrl;
}
