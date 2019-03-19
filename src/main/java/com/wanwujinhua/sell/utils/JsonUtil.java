package com.wanwujinhua.sell.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @desc ：JsonUtil
 * @auth ：pdp
 * @date ：Created in 2019/3/19 16:37
 */
public class JsonUtil {

    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
