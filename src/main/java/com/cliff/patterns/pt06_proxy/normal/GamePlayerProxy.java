package com.cliff.patterns.pt06_proxy.normal;

public class GamePlayerProxy implements IGamePLayer {
    private final IGamePLayer pLayer;

    public GamePlayerProxy(IGamePLayer pLayer) {
        this.pLayer = pLayer;
    }

    @Override
    public void login(String username, String password) {
        this.pLayer.login(username, password);
    }

    @Override
    public void killBoss() {
        this.pLayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.pLayer.upgrade();
    }
}
