package com.cliff.patterns.pt28_bridge;

/**
 * author:CliffLeopard
 * date:2021/9/15
 * time:09:23
 * email:precipiceleopard@gmail.com
 * link:
 */
public abstract class Abstraction {
    private final Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void request() {
        implementor.doSomething();
    }

    public Implementor getImplementor() {
        return implementor;
    }
}
