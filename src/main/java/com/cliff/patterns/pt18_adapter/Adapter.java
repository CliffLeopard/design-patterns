package com.cliff.patterns.pt18_adapter;

/**
 * author:CliffLeopard
 * date:2021/9/14
 * time:08:40
 * email:precipiceleopard@gmail.com
 * link:
 * 类适配器： 适配器的一种.采用继承关系
 * 还有一种：对象适配器。见AdapterObject。采用关联关系
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
