package com.cliff.patterns.pt19_observe;

/**
 * author:CliffLeopard
 * date:2021/9/15
 * time:07:53
 * email:precipiceleopard@gmail.com
 * link:
 */
public class ConcreteSubject extends Subject {

    @Override
    public void realDoSomething() {
        System.out.println("Just Do Something");
    }
}
