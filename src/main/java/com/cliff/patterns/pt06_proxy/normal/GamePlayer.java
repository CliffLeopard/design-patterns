package com.cliff.patterns.pt06_proxy.normal;

public class GamePlayer implements IGamePLayer {
    private String username;

    @Override
    public void login(String username, String password) {
        this.username = username;
        System.out.println(username + " login success");
    }

    @Override
    public void killBoss() {
        System.out.println(username + " is killing boss");
    }

    @Override
    public void upgrade() {
        System.out.println(username + " upgrade!");
    }

}
