package com.cliff.patterns.pt28_bridge4;

/**
 * author:CliffLeopard
 * date:2021/9/17
 * time:07:47
 * email:precipiceleopard@gmail.com
 * link:
 */
public class BridgePatternDemo4 {
    public static void main(String[] args) {
        RefinedCoffee largeWithMilk = new LargeCoffee(new Milk());
        largeWithMilk.orderCoffee(2);
        largeWithMilk.checkQuality();

        System.out.println("\n======\n");

        RefinedCoffee middleSugar = new MiddleCoffee(new Sugar());
        middleSugar.orderCoffee(3);
        middleSugar.checkQuality();


        System.out.println("\n======\n");

        RefinedCoffee middleMilk = new MiddleCoffee(new Milk());
        middleMilk.orderCoffee(3);
        middleMilk.checkQuality();
    }
}
