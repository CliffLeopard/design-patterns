package com.cliff.patterns.pt19_observe2;

import java.util.Observable;

/**
 * author:CliffLeopard
 * date:2021/9/15
 * time:08:13
 * email:precipiceleopard@gmail.com
 * link:
 */
public class HanFeiZi extends Observable implements IHanFeiZi {
    @Override
    public void doSomething1() {
        setChanged();
        notifyObservers(this);
    }

    @Override
    public void doSomething2() {
        notifyObservers(this);
    }

    @Override
    public String toString() {
        return "HanFeiZi";
    }
}
