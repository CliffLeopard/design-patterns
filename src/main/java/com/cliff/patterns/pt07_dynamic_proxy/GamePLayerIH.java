package com.cliff.patterns.pt07_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePLayerIH implements InvocationHandler {
    private final IGamePLayer pLayer;

    public GamePLayerIH(IGamePLayer pLayer) {
        this.pLayer = pLayer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("upgrade")) {
            beforeUpgrade();
            Object object = method.invoke(this.pLayer, args);
            afterUpgrade();
            return object;
        } else {
            return method.invoke(this.pLayer, args);
        }
    }

    private void beforeUpgrade() {
        System.out.println("beforeUpgrade");
    }

    private void afterUpgrade() {
        System.out.println("afterUpgrade");
    }
}
