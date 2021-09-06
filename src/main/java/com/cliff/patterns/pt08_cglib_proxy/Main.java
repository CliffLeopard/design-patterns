package com.cliff.patterns.pt08_cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

public class Main {
    public static void main(String[] args) {
        simple();
        classMode();
    }

    public static void classMode() {
        GamePlayer gamePlayer = new GamePlayer();
        GamePlayer proxy = new ProxyFactory<>(gamePlayer).createProxy();
        proxy.login("cliffleopard", "12345");
        proxy.killBoss();
        proxy.upgrade();
    }

    public static void simple() {
        GamePlayer gamePlayer = new GamePlayer();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(gamePlayer.getClass());
        enhancer.setCallback((MethodInterceptor) (obj, method, args, proxy) -> {
            if (!method.getName().equals("upgrade")) {
                return proxy.invokeSuper(obj, args);
            } else {
                System.out.println("before upgrade");
                Object result = proxy.invokeSuper(obj, args);
                System.out.println("after upgrade");
                return result;
            }
        });
        GamePlayer proxy = (GamePlayer) enhancer.create();
        proxy.login("cliffleopard", "12345");
        proxy.killBoss();
        proxy.upgrade();
    }
}
