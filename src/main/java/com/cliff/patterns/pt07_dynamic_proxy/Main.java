package com.cliff.patterns.pt07_dynamic_proxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        simple();
    }

    public static void classMode() {
        IGamePLayer pLayer = new GamePlayer();
        GamePLayerIH gamePLayerIH = new GamePLayerIH(pLayer);
        IGamePLayer proxy = (IGamePLayer) Proxy.newProxyInstance(pLayer.getClass().getClassLoader(), new Class[]{IGamePLayer.class}, gamePLayerIH);
        proxy.login("cliffleopard", "1234");
        proxy.killBoss();
        proxy.upgrade();
    }

    public static void simple() {
        IGamePLayer pLayer = new GamePlayer();
        IGamePLayer proxy = (IGamePLayer) Proxy.newProxyInstance(
                pLayer.getClass().getClassLoader(),
                new Class[]{IGamePLayer.class}, (proxy1, method, args) -> {
                    if (method.getName().equals("upgrade")) {
                        System.out.println("before upgrade");
                        Object object = method.invoke(pLayer, args);
                        System.out.println("after upgrade");
                        return object;
                    } else {
                        return method.invoke(pLayer, args);
                    }
                });
        proxy.login("cliffleopard", "1234");
        proxy.killBoss();
        proxy.upgrade();
    }
}
