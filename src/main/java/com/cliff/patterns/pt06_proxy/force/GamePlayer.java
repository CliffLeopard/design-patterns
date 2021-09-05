package com.cliff.patterns.pt06_proxy.force;

public class GamePlayer implements IGamePLayer {
    private final String username;
    private IGamePLayer proxy;

    public GamePlayer(String username) {
        this.username = username;
    }

    @Override
    public void login(String password) {
        if (byProxy())
            System.out.println(username + " login success");
    }

    @Override
    public void killBoss() {
        if (byProxy())
            System.out.println(username + " is killing boss");
    }

    @Override
    public void upgrade() {
        if (byProxy())
            System.out.println(username + " upgrade!");
    }

    @Override
    public IGamePLayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return proxy;
    }

    private boolean byProxy() {
        if (this.proxy == null) {
            System.out.println("请通过代理访问");
            return false;
        } else
            return true;

    }
}
