package com.cliff.patterns.pt11_order;

/**
 * author:CliffLeopard
 * date:2021/9/7
 * time:08:31
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
