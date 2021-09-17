package com.cliff.patterns.pt28_bridge4;

import java.util.Random;

/**
 * author:CliffLeopard
 * date:2021/9/17
 * time:07:46
 * email:precipiceleopard@gmail.com
 * link:
 */
public abstract class RefinedCoffee extends Coffee {
    public RefinedCoffee(ICoffeeAdditives iCoffeeAdditives) {
        super(iCoffeeAdditives);
    }

    public void checkQuality() {
        Random ran = new Random();
        System.out.printf("%s 添加%s%n", iCoffeeAdditives.getClass().getSimpleName(), ran.nextBoolean() ? "太多" : "正常");
    }
}
