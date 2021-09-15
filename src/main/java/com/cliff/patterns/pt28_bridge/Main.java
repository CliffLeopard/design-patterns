package com.cliff.patterns.pt28_bridge;

/**
 * author:CliffLeopard
 * date:2021/9/15
 * time:09:28
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Main {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementor1();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.request();
    }
}
