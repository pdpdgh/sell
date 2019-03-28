package com.wanwujinhua.sell.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wanwujinhua.sell.enums.ProductStatusEnum;
import com.wanwujinhua.sell.utils.EnumUtil;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @desc ：商品信息
 * @auth ：pdp
 * @date ：Created in 2019/3/14 18:42
 */
@Entity
@Data
@DynamicUpdate
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
    private Integer productStatus = ProductStatusEnum.UP.getCode();

    /** @desc : 类目编号 */
    private Integer categoryType;

    /** @desc : 创建时间 */
    private Date createTime;

    /** @desc : 更新时间 */
    private Date updateTime;

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum() {
        return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
    }
}
