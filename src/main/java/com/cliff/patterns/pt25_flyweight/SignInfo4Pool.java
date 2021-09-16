package com.cliff.patterns.pt25_flyweight;

/**
 * author:CliffLeopard
 * date:2021/9/16
 * time:07:54
 * email:precipiceleopard@gmail.com
 * link:
 */
public class SignInfo4Pool extends SignInfo {
    private String key;

    public SignInfo4Pool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
