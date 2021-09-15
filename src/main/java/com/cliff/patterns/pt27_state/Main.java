package com.cliff.patterns.pt27_state;

/**
 * author:CliffLeopard
 * date:2021/9/15
 * time:08:39
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(new ConcreteState1());
        context.handle1();
        context.handle2();
        context.handle1();
    }
}
