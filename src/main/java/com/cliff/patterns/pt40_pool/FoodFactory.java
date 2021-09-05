package com.cliff.patterns.pt40_pool;

import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;

public class FoodFactory extends BasePooledObjectFactory<Food> {

    @Override
    public Food create() throws Exception {
        return Food.newInstance();
    }

    @Override
    public PooledObject<Food> wrap(Food obj) {
        return new PooledFood(obj);
    }
}
