package com.cliff.patterns.pt26_interpreter2;

import java.util.HashMap;

/**
 * author:CliffLeopard
 * date:2021/9/16
 * time:07:04
 * email:precipiceleopard@gmail.com
 * link:
 */
public abstract class Expression {
    public abstract int interpreter(HashMap<String, Integer> var);
}
