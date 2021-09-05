package com.cliff.patterns.pt08_cglib_proxy;

public class GamePlayer {
    private String username;

    public void login(String username, String password) {
        this.username = username;
        System.out.println(username + " login success");
    }

    public void killBoss() {
        System.out.println(username + " is killing boss");
    }

    public void upgrade() {
        System.out.println(username + " upgrade!");
    }
}
