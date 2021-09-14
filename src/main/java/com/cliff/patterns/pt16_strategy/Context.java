package com.cliff.patterns.pt16_strategy;

/**
 * author:CliffLeopard
 * date:2021/9/14
 * time:08:04
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Context {
    private Strategy strategy = null;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAnything() {
        this.strategy.doSomething();
    }
}
