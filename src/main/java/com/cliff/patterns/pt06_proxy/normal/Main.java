package com.cliff.patterns.pt06_proxy.normal;

import com.cliff.patterns.pt06_proxy.normal.GamePlayer;
import com.cliff.patterns.pt06_proxy.normal.GamePlayerProxy;
import com.cliff.patterns.pt06_proxy.normal.IGamePLayer;

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

    /**
     * 强制代理模式，通过实例获取代理
     */
    public static void forceProxy() {


    }
}
