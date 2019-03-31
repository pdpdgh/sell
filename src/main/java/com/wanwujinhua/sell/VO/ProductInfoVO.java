package com.wanwujinhua.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @desc ：商品详情VO
 * @auth ：pdp
 * @date ：Created in 2019/3/15 1:12
 */
@Data
public class ProductInfoVO implements Serializable {

    private static final long serialVersionUID = -2964644948838965970L;

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
