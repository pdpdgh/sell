package com.wanwujinhua.sell.form;

import lombok.Data;

/**
 * @desc ：类目表单
 * @auth ：pdp
 * @date ：Created in 2019/3/29 2:56
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** @desc : 类目名称 */
    private String categoryName;

    /** @desc : 类目编号 */
    private Integer categoryType;
}
