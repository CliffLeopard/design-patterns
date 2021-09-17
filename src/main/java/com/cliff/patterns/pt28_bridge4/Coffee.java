package com.cliff.patterns.pt28_bridge4;

/**
 * author:CliffLeopard
 * date:2021/9/17
 * time:07:46
 * email:precipiceleopard@gmail.com
 * link:
 */
public abstract class Coffee {
    protected ICoffeeAdditives iCoffeeAdditives;

    public Coffee(ICoffeeAdditives iCoffeeAdditives) {
        this.iCoffeeAdditives = iCoffeeAdditives;
    }

    public abstract void orderCoffee(int count);
}
