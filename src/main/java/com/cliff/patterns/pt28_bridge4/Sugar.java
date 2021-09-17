package com.cliff.patterns.pt28_bridge4;

/**
 * author:CliffLeopard
 * date:2021/9/17
 * time:07:47
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Sugar implements ICoffeeAdditives {
    @Override
    public void cook() {
        System.out.println("加糖");
    }
}
