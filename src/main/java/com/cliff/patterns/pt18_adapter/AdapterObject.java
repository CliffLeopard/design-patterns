package com.cliff.patterns.pt18_adapter;

/**
 * author:CliffLeopard
 * date:2021/9/14
 * time:08:50
 * email:precipiceleopard@gmail.com
 * link:
 */
public class AdapterObject implements Target {
    private final Adaptee adaptee;

    public AdapterObject(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.doSomething();
    }
}
