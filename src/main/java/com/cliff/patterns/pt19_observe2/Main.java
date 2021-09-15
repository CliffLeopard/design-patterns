package com.cliff.patterns.pt19_observe2;

/**
 * author:CliffLeopard
 * date:2021/9/15
 * time:08:15
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Main {
    public static void main(String[] args) {
        HanFeiZi han = new HanFeiZi();
        LiSi lisi = new LiSi();
        han.addObserver(lisi);
        han.doSomething1();
    }
}
