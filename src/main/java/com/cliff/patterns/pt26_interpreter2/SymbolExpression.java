package com.cliff.patterns.pt26_interpreter2;

import java.util.HashMap;

/**
 * author:CliffLeopard
 * date:2021/9/16
 * time:07:05
 * email:precipiceleopard@gmail.com
 * link:
 */
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
