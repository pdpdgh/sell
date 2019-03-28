package com.wanwujinhua.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @desc ：商品类目
 * @auth ：pdp
 * @date ：Created in 2019/3/14 14:47
 */
@Entity
@Data
public class ProductCategory {

    /** @desc : 类目id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    /** @desc : 类目名称 */
    private String categoryName;

    /** @desc : 类目编号 */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
