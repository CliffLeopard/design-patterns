package com.cliff.patterns.pt26_interpreter2;

import java.util.HashMap;
import java.util.Stack;

/**
 * author:CliffLeopard
 * date:2021/9/16
 * time:07:11
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Calculator {
    private final Expression expression;

    public Calculator(String expStr) {
        Stack<Expression> stack = new Stack<>();
        char[] charArray = expStr.toCharArray();
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> variables) {
        return this.expression.interpreter(variables);
    }
}
