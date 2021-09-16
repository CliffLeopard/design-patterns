package com.cliff.patterns.pt28_bridge2;

/**
 * author:CliffLeopard
 * date:2021/9/16
 * time:08:28
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Client {
    public static void main(String[] args) {
        ConcreteProduct1 product1 = new ConcreteProduct1();
        ConcreteCorp1 corp1 = new ConcreteCorp1(product1);
        corp1.makeMoney();
    }
}
