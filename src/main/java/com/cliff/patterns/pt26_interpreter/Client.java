package com.cliff.patterns.pt26_interpreter;

import java.util.Stack;

/**
 * author:CliffLeopard
 * date:2021/9/16
 * time:07:00
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        Stack<Expression> stack =null;
//        for (;;){
//            stack.push(new );  语法判断并递归调用
//        }
        Expression expression = stack.pop();
        expression.interpreter(context);
    }
}
