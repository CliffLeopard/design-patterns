package com.cliff.patterns.pool;

public class FoodCenter {
    public static void main(String[] args) throws Exception {
        FoodPool pool = new FoodPool(new FoodFactory(), new FoodConfig());
        for (int i = 0; i < 10; i++) {
            Food food = pool.borrowObject();
            System.out.println(food.toString());
            pool.returnObject(food);
        }
    }
}
