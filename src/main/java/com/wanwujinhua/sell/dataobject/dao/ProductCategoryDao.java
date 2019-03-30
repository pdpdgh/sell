package com.wanwujinhua.sell.dataobject.dao;

import com.wanwujinhua.sell.dataobject.mapper.ProductCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @desc ：ProductCategoryDao
 * @auth ：pdp
 * @date ：Created in 2019/3/30 21:25
 */
public class ProductCategoryDao {

    @Autowired
    ProductCategoryMapper mapper;

    public int insertByMap(Map<String, Object> map) {
        return mapper.insertByMap(map);
    }
}
