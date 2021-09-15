package com.cliff.patterns.pt19_observe;

/**
 * author:CliffLeopard
 * date:2021/9/15
 * time:07:54
 * email:precipiceleopard@gmail.com
 * link:
 */
public class ConcreteObserver extends Observer {
    @Override
    public void update() {
        System.out.println("收到消息，进行更新");
    }
}
