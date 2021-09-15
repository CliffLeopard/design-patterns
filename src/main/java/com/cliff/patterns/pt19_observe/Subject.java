package com.cliff.patterns.pt19_observe;

import java.util.Vector;

/**
 * author:CliffLeopard
 * date:2021/9/15
 * time:07:53
 * email:precipiceleopard@gmail.com
 * link:
 */
public abstract class Subject {
    private final Vector<Observer> observers = new Vector<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public final void doSomething(){
        realDoSomething();
        notifyObservers();
    }

    public abstract void  realDoSomething();

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
