package com.cliff.patterns.pt06_proxy.force;

public class Main {
    public static void main(String[] args) {
        // 错误写法
        IGamePLayer gamePLayer = new GamePlayer("Cliff");
        gamePLayer.login("12345");
        gamePLayer.killBoss();
        gamePLayer.upgrade();


        // 这里也是对的，说明《设计模式之禅》代码写错了。 这样设计的强制代理模式是有问题的。
        IGamePLayer gamePLayer2 = new GamePlayer("Leopard");
        IGamePLayer proxy2 = new GamePlayerProxy(gamePLayer2);
        System.out.println("proxy2 is gamePlayer2's Proxy?:" + (proxy2.equals(gamePLayer2.getProxy())));
        proxy2.login("67890");
        proxy2.killBoss();
        proxy2.upgrade();



        // 唯一正确的写法
        IGamePLayer gamePLayer1 = new GamePlayer("Leopard");
        IGamePLayer proxy = gamePLayer1.getProxy();
        proxy.login("67890");
        proxy.killBoss();
        proxy.upgrade();
    }
}
