package com.cliff.patterns.pt27_state;

/**
 * author:CliffLeopard
 * date:2021/9/15
 * time:08:38
 * email:precipiceleopard@gmail.com
 * link:
 */
public abstract class State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void handle1();
    public abstract void handle2();
}
