package com.cliff.patterns.pt28_bridge4;

/**
 * author:CliffLeopard
 * date:2021/9/17
 * time:07:56
 * email:precipiceleopard@gmail.com
 * link:
 */
public class MiddleCoffee extends RefinedCoffee {
    public MiddleCoffee(ICoffeeAdditives iCoffeeAdditives) {
        super(iCoffeeAdditives);
    }

    @Override
    public void orderCoffee(int count) {
        System.out.println("中杯咖啡" + count + "杯");
        iCoffeeAdditives.cook();
    }
}
