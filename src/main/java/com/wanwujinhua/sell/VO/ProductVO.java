package com.wanwujinhua.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @desc ：商品VO（包含类目）
 * @auth ：pdp
 * @date ：Created in 2019/3/15 1:17
 */
@Data
public class ProductVO implements Serializable {

    private static final long serialVersionUID = 7474929436666474960L;

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
