package com.core.ztx.util;

import java.util.UUID;

/**
 * Created by Administrator on 2017/11/6.
 */
public class IdUtil {

    public static String getUUID(){
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr=str.replace("-", "");
        return uuidStr;
    }
}
