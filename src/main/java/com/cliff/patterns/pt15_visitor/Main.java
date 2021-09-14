package com.cliff.patterns.pt15_visitor;

/**
 * author:CliffLeopard
 * date:2021/9/7
 * time:10:28
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerComponentDisplayVisitor());
    }
}
