package com.cliff.patterns.pt15_visitor;

/**
 * author:CliffLeopard
 * date:2021/9/7
 * time:10:19
 * email:precipiceleopard@gmail.com
 * link:
 */
public abstract class ComputerComponent {
    abstract void accept(ComputerComponentVisitor visitor);
}
