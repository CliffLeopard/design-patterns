package com.cliff.patterns.pt28_bridge3;

/**
 * author:CliffLeopard
 * date:2021/9/17
 * time:07:33
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Circle extends Shape {
    int radius, x, y;

    public Circle(int radius, int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        super.drawAPI.drawCircle(radius, x, y);
    }
}
