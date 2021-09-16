package com.cliff.patterns.pt25_flyweight2;

import java.util.HashMap;

/**
 * author:CliffLeopard
 * date:2021/9/16
 * time:08:06
 * email:precipiceleopard@gmail.com
 * link:
 */
public class FlyWeightFactory {
    private static HashMap<String, FlyWeight> pool = new HashMap<>();

    public static FlyWeight getFlyWeight(String extrinsic) {
        FlyWeight flyWeight = null;
        if (pool.containsKey(extrinsic)) {
            flyWeight = pool.get(extrinsic);
        } else {
            flyWeight = new ConcreteFlyWeight1(extrinsic);
            pool.put(extrinsic, flyWeight);
        }
        return flyWeight;
    }
}
