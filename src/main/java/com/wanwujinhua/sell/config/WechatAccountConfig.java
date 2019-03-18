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
}
