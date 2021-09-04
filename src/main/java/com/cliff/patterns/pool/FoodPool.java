package com.cliff.patterns.pool;

import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.AbandonedConfig;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

public class FoodPool extends GenericObjectPool<Food> {
    public FoodPool(PooledObjectFactory<Food> factory) {
        super(factory);
    }

    public FoodPool(PooledObjectFactory<Food> factory, GenericObjectPoolConfig<Food> config) {
        super(factory, config);
    }

    public FoodPool(PooledObjectFactory<Food> factory, GenericObjectPoolConfig<Food> config, AbandonedConfig abandonedConfig) {
        super(factory, config, abandonedConfig);
    }

}
