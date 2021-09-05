package com.cliff.patterns.pt40_pool;

import org.apache.commons.pool2.impl.DefaultPooledObject;

public class PooledFood extends DefaultPooledObject<Food> {

    /**
     * Create a new instance that wraps the provided object so that the pool can
     * track the state of the pooled object.
     *
     * @param object The object to wrap
     */
    public PooledFood(Food object) {
        super(object);
    }
}
