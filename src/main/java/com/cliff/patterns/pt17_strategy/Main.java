package com.cliff.patterns.pt17_strategy;

/**
 * author:CliffLeopard
 * date:2021/9/14
 * time:08:25
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        int b = Integer.parseInt(args[2]);
        int result = Calculator.valueOf(symbol).exec(a, b);
    }
}
