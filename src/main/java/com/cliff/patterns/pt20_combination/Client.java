package com.cliff.patterns.pt20_combination;

/**
 * author:CliffLeopard
 * date:2021/9/15
 * time:07:40
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Client {
    public static void main(String[] args) {
        Branch root = new Branch();
        Branch branch = new Branch();
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);
    }

    public static void display(Branch tree) {
        for (Tree node : tree.getChildren()) {
            if (node instanceof Leaf) {
                node.doSomething();
            } else {
                Client.display((Branch) node);
            }
        }
    }
}
