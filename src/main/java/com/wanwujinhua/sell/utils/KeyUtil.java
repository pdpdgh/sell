package com.wanwujinhua.sell.utils;

import java.util.Random;

/**
 * @desc ：KeyUtil
 * @auth ：pdp
 * @date ：Created in 2019/3/16 2:50
 */
public class KeyUtil {

    /**
     * @desc : 生成唯一的主键，格式：时间 + 随机数
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
