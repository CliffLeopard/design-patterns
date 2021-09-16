package com.cliff.patterns.pt28_bridge2;

/**
 * author:CliffLeopard
 * date:2021/9/16
 * time:08:25
 * email:precipiceleopard@gmail.com
 * link:
 */
public abstract class Corp {
    private final Product product;

    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney() {
        product.beProduced();
        product.beSelled();
    }
}
