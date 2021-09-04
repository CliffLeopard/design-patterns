package com.cliff.patterns.pool;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

public class FoodConfig extends GenericObjectPoolConfig<Food> {
    public FoodConfig() {
        setMaxIdle(1);
        setMinIdle(1);
        setMaxTotal(3);
    }
}

