package com.cliff.patterns.pt06_proxy.normal;

public class Main {
    public static void main(String[] args) {
        normalProxy();
    }

    /**
     * 普通代理模式，通过代理获取实例
     */
    public static void normalProxy() {
        IGamePLayer gamePLayer = new GamePlayer();
        IGamePLayer proxy = new GamePlayerProxy(gamePLayer);
        proxy.login("cliffleopard", "1234");
        proxy.killBoss();
        proxy.upgrade();
    }
}
