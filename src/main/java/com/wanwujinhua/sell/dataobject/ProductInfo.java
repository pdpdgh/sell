package com.wanwujinhua.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @desc ：商品信息
 * @auth ：pdp
 * @date ：Created in 2019/3/14 18:42
 */
@Entity
@DynamicUpdate
@Data
public class ProductInfo {

    /** @desc : id */
    @Id
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

    /** @desc : 状态 0正常1下架 */
    private Integer productStatus;

    /** @desc : 类目编号 */
    private Integer categoryType;
}
