package com.cliff.patterns.pt28_bridge3;

/**
 * author:CliffLeopard
 * date:2021/9/17
 * time:07:32
 * email:precipiceleopard@gmail.com
 * link:
 */
public class RedCircle implements  DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
