package com.wanwujinhua.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @desc ：ProjectUrlConfig
 * @auth ：pdp
 * @date ：Created in 2019/3/29 15:09
 */
@Component
@Data
@ConfigurationProperties(prefix = "project-url")
public class ProjectUrlConfig {

    /** @desc : 微信公众平台授权url */
    public String wechatMpAuthorize;

    /** @desc : 微信开放平台授权url */
    public String wechatOpenAuthorize;

    /** @desc : 点餐系统 */
    public String sell;
}
