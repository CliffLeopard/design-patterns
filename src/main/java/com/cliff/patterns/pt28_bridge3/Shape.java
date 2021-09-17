package com.cliff.patterns.pt28_bridge3;

/**
 * author:CliffLeopard
 * date:2021/9/17
 * time:07:32
 * email:precipiceleopard@gmail.com
 * link:
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
