package com.cliff.patterns.pt20_combination;

import java.util.ArrayList;
import java.util.List;

/**
 * author:CliffLeopard
 * date:2021/9/15
 * time:07:36
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Branch extends Tree {
    private ArrayList<Tree> trees = new ArrayList<>();

    public void add(Tree tree) {
        trees.add(tree);
    }

    public void remove(Tree tree) {
        trees.remove(tree);
    }

    public List<Tree> getChildren() {
        return trees;
    }

}
