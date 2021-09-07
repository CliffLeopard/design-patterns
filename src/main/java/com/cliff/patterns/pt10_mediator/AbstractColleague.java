package com.cliff.patterns.pt10_mediator;

/**
 * author:CliffLeopard
 * date:2021/9/7
 * time:08:13
 * email:precipiceleopard@gmail.com
 * link:
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
