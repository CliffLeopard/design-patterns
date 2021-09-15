package com.cliff.patterns.pt26_interpreter;

/**
 * author:CliffLeopard
 * date:2021/9/15
 * time:08:52
 * email:precipiceleopard@gmail.com
 * link:
 */
public class NoTerminalExpression extends Expression {

    public NoTerminalExpression(Expression... expressions) {

    }

    @Override
    public Object interpreter(Context context) {
        return null;
    }
}
