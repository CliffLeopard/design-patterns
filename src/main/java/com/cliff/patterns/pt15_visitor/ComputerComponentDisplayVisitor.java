package com.cliff.patterns.pt15_visitor;

/**
 * author:CliffLeopard
 * date:2021/9/7
 * time:10:29
 * email:precipiceleopard@gmail.com
 * link:
 */
public class ComputerComponentDisplayVisitor implements ComputerComponentVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Display computer");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Display mouse");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Display keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Display monitor");
    }
}
