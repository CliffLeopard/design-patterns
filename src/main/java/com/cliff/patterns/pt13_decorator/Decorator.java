package com.cliff.patterns.pt13_decorator;

/**
 * author:CliffLeopard
 * date:2021/9/13
 * time:08:22
 * email:precipiceleopard@gmail.com
 * link:
 * 抽象 装饰类
 * 装饰器模式:使内容和表示解耦。是继承关系的替代方案
 */
public abstract class Decorator extends Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public abstract void method1();

    @Override
    public final void operator() {
        method1();
        this.component.operator();
    }
}
