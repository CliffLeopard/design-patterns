package com.cliff.patterns.pt17_strategy;

/**
 * author:CliffLeopard
 * date:2021/9/14
 * time:08:14
 * email:precipiceleopard@gmail.com
 * link:
 * 策略枚举
 */
public enum Calculator {

    ADD("+") {
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        public int exec(int a, int b) {
            return a - b;
        }
    };

    public abstract int exec(int a, int b);

    String value = "";

    private Calculator(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
