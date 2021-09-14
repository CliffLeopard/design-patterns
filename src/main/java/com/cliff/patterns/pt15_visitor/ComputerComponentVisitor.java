package com.cliff.patterns.pt15_visitor;

/**
 * author:CliffLeopard
 * date:2021/9/7
 * time:10:20
 * email:precipiceleopard@gmail.com
 * link:
 */
public interface ComputerComponentVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
