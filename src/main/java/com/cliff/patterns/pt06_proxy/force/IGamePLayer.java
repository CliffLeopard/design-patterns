package com.cliff.patterns.pt06_proxy.force;

public interface IGamePLayer {
    void login(String password);

    void killBoss();

    void upgrade();

    IGamePLayer getProxy();
}
