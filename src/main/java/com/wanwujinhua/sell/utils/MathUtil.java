package com.wanwujinhua.sell.utils;

/**
 * @desc ：MathUtil
 * @auth ：pdp
 * @date ：Created in 2019/3/19 19:16
 */
public class MathUtil {

    private static final Double MONEY_RANGE = 0.01;

    /**
     * @desc : 比较2个金额是否相等
     */
    public static Boolean equals(Double d1, Double d2) {
        Double result = Math.abs(d1 - d2);
        if (result < MONEY_RANGE) {
            return true;
        } else {
            return false;
        }
    }
}
