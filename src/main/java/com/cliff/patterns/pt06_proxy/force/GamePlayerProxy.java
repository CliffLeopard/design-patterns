package com.cliff.patterns.pt06_proxy.force;

public class GamePlayerProxy implements IGamePLayer {
    private final IGamePLayer pLayer;

    public GamePlayerProxy(IGamePLayer pLayer) {
        this.pLayer = pLayer;
    }

    @Override
    public void login(String password) {
        this.pLayer.login(password);
    }

    @Override
    public void killBoss() {
        this.pLayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.pLayer.upgrade();
    }

    @Override
    public IGamePLayer getProxy() {
        return this;
    }
}
