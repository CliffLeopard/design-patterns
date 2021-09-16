package com.cliff.patterns.pt26_interpreter2;

import java.util.HashMap;

/**
 * author:CliffLeopard
 * date:2021/9/16
 * time:07:05
 * email:precipiceleopard@gmail.com
 * link:
 */
public class VarExpression extends Expression {
    private final String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
