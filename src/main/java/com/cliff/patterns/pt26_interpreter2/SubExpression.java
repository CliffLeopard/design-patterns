package com.cliff.patterns.pt26_interpreter2;

import java.util.HashMap;

/**
 * author:CliffLeopard
 * date:2021/9/16
 * time:07:08
 * email:precipiceleopard@gmail.com
 * link:
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
