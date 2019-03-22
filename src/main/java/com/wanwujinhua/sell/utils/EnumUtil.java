package com.wanwujinhua.sell.utils;

import com.wanwujinhua.sell.enums.CodeEnum;

/**
 * @desc ：EnumUtil
 * @auth ：pdp
 * @date ：Created in 2019/3/22 17:35
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
