package com.cliff.patterns.pt27_state;

/**
 * author:CliffLeopard
 * date:2021/9/15
 * time:08:39
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Context extends State {
    public final static State STATE1 = new ConcreteState1();
    public final static State STATE2 = new ConcreteState2();
    private State currentState;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        this.currentState.setContext(this);
    }

    @Override
    public void handle1() {
        this.currentState.handle1();
    }

    @Override
    public void handle2() {
        this.currentState.handle2();
    }
}
