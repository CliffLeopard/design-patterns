package com.cliff.patterns.pt11_order;

/**
 * author:CliffLeopard
 * date:2021/9/7
 * time:08:32
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Main {
    public static void main(String[] args) {
        Invoker manager = new Invoker();
        Command command = new AddRequirementCommand();
        manager.setCommand(command);
        manager.action();


        command = new DeletePageCommand();
        manager.setCommand(command);
        manager.action();
    }
}
