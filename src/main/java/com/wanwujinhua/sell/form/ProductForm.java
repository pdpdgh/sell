package com.wanwujinhua.sell.form;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @desc ：商品表单
 * @auth ：pdp
 * @date ：Created in 2019/3/29 1:21
 */
@Data
public class ProductForm {

    private String productId;

    /** @desc : 名称 */
    private String productName;

    /** @desc : 单价 */
    private BigDecimal productPrice;

    /** @desc : 库存 */
    private Integer productStock;

    /** @desc : 描述 */
    private String productDescription;

    /** @desc : 小图 */
    private String productIcon;

    /** @desc : 类目编号 */
    private Integer categoryType;
}
