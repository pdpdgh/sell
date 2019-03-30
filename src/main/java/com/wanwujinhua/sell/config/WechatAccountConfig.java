package com.wanwujinhua.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @desc ：WechatAccountConfig
 * @auth ：pdp
 * @date ：Created in 2019/3/19 4:08
 */
@Component
@Data
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {

    /** @desc : 公众平台id */
    private String mpAppId;

    /** @desc : 公众平台秘钥 */
    private String mpAppSecret;

    /** @desc : 开放平台id */
    private String openAppId;

    /** @desc : 开放平台秘钥 */
    private String openAppSecret;

    /** @desc : 商户号 */
    private String mchId;

    /** @desc : 商户秘钥 */
    private String mchKey;

    /** @desc : 商户证书路径 */
    private String keyPath;

    /** @desc : 微信支付异步通知地址 */
    private String notifyUrl;

    /** @desc : 微信模板id */
    private Map<String, String> templateId;
}
