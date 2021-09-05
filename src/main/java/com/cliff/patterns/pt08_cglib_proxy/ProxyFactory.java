package com.cliff.patterns.pt08_cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory<T> implements MethodInterceptor {

    private T originObj;
    private T proxy;

    public ProxyFactory(T originObj) {
        this.originObj = originObj;
    }

    public T createProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(originObj.getClass());
        enhancer.setCallback(this);
        proxy = (T) enhancer.create();
        return proxy;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if (method.getName().equals("upgrade")) {
            System.out.println("before upgrade");
            Object result = methodProxy.invokeSuper(obj, args);
            System.out.println("after upgrade");
            return result;
        } else {
            return methodProxy.invokeSuper(obj, args);
        }
    }
}
