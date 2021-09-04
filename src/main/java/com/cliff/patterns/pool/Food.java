package com.cliff.patterns.pool;

import java.util.Random;

public class Food {
    public static int serialNum = 0;
    private static final Random random = new Random(System.currentTimeMillis());

    public static Food newInstance() {
        return new Food();
    }

    private String name;
    private int price;
    private long createTime;
    private boolean using;

    public Food() {
        this.name = "Food_" + serialNum;
        serialNum++;
        this.price = random.nextInt(10);
        this.createTime = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setUsing(boolean using) {
        this.using = using;
    }
}
