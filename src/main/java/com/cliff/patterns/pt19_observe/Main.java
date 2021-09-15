package com.cliff.patterns.pt19_observe;

/**
 * author:CliffLeopard
 * date:2021/9/15
 * time:07:59
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.addObserver(observer);
        subject.doSomething();
    }
}
