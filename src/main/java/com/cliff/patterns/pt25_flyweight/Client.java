package com.cliff.patterns.pt25_flyweight;

/**
 * author:CliffLeopard
 * date:2021/9/16
 * time:07:53
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            String subject = "科目" + i;
            for (int j = 0; j < 30; j++) {
                String key = subject + "考试地点" + j;
                SignInfoFactory.getSignInfo(key);
            }
        }

        SignInfo signInfo = SignInfoFactory.getSignInfo("科目1考试地点1");
    }
}
