package com.cliff.patterns.pt10_mediator;

/**
 * author:CliffLeopard
 * date:2021/9/7
 * time:08:12
 * email:precipiceleopard@gmail.com
 * link:
 */
public class ConcreteMediator extends AbstractMediator {
    private AbstractColleague colleague1, colleague2, colleague3;

    public ConcreteMediator() {
        colleague1 = new Colleague1(this);
        colleague2 = new Colleague2(this);
        colleague3 = new Colleague3(this);
    }

    @Override
    public void doSomething1() {

    }

    @Override
    public void doSomething2() {

    }
}
