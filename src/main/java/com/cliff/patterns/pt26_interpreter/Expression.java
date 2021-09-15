package com.cliff.patterns.pt26_interpreter;

/**
 * author:CliffLeopard
 * date:2021/9/15
 * time:08:51
 * email:precipiceleopard@gmail.com
 * link:
 */
public abstract class Expression {
    public abstract Object interpreter(Context context);
}
