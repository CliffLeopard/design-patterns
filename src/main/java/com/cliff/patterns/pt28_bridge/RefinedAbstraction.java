package com.cliff.patterns.pt28_bridge;

/**
 * author:CliffLeopard
 * date:2021/9/15
 * time:09:24
 * email:precipiceleopard@gmail.com
 * link:
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void request() {
        super.request();
        super.getImplementor().doAnything();
    }
}
