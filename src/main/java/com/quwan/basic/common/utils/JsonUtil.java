package com.quwan.basic.common.utils;

import com.google.gson.Gson;

/**
 * @author shiliang.gao
 * @since 2016-11-20
 */
public class JsonUtil {

    private static Gson gson = new Gson();

    public static Gson getGson(){
        return gson;
    }
}
