package com.cliff.patterns.pt10_mediator;

/**
 * author:CliffLeopard
 * date:2021/9/7
 * time:08:14
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Colleague1 extends AbstractColleague {
    public Colleague1(AbstractMediator mediator) {
        super(mediator);
    }

    public void selfMethod1() {
        System.out.println("do self method1");
    }

    public void selfMethod2() {
        System.out.println("do self method1");
    }


    public void doInteractionMethod() {
        this.mediator.doSomething1();
    }

    public void doInteractionMethod2() {
        this.mediator.doSomething2();
    }
}
