package com.cliff.patterns.pt15_visitor;

/**
 * author:CliffLeopard
 * date:2021/9/7
 * time:10:19
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Computer extends ComputerComponent {
    private final ComputerComponent[] components = new ComputerComponent[]{new Keyboard(), new Mouse(), new Monitor()};

    public Computer() {

    }

    @Override
    void accept(ComputerComponentVisitor visitor) {
        for (ComputerComponent component : components) {
            component.accept(visitor);
        }
        visitor.visit(this);
    }
}
