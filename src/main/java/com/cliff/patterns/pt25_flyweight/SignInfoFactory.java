package com.cliff.patterns.pt25_flyweight;

import java.util.HashMap;

/**
 * author:CliffLeopard
 * date:2021/9/16
 * time:07:52
 * email:precipiceleopard@gmail.com
 * link:
 */
public class SignInfoFactory {
    private static final HashMap<String, SignInfo> pool = new HashMap<>();

    @Deprecated
    public static SignInfo getSignInfo() {
        return new SignInfo();
    }

    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;
        if (!pool.containsKey(key)) {
            System.out.println(key+"     ----建立对象，并放置到池中");
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        } else {
            System.out.println(key+"     ----直接从池中获取");
            result = pool.get(key);
        }
        return result;
    }
}
