package com.cliff.patterns.pt28_bridge3;

/**
 * author:CliffLeopard
 * date:2021/9/17
 * time:07:33
 * email:precipiceleopard@gmail.com
 * link:
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
