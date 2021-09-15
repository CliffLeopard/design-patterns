package com.cliff.patterns.pt27_state;

/**
 * author:CliffLeopard
 * date:2021/9/15
 * time:08:39
 * email:precipiceleopard@gmail.com
 * link:
 */
public class ConcreteState2 extends State{
    @Override
    public void handle1() {
        super.context.setCurrentState(Context.STATE1);
        System.out.println("change state from handle2 to handle1");
        super.context.handle1();
    }

    @Override
    public void handle2() {
        System.out.println("ConcreteState2 do handle2");
    }
}
