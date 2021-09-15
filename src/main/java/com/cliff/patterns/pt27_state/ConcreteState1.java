package com.cliff.patterns.pt27_state;

/**
 * author:CliffLeopard
 * date:2021/9/15
 * time:08:39
 * email:precipiceleopard@gmail.com
 * link:
 */
public class ConcreteState1 extends State {
    @Override
    public void handle1() {
        System.out.println("ConcreteState1 do handle1");
    }

    @Override
    public void handle2() {
        System.out.println("change state from handle1 to handle2");
        super.context.setCurrentState(Context.STATE2);
        super.context.handle2();
    }
}
