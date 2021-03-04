package com.cliff.patterns.singleton;

public class StaticInnerClass {

    private StaticInnerClass() {
        // TODO: 实例初始化
    }

    public static StaticInnerClass getInstance() {
        return InnerClass.singleton;
    }

    public static class InnerClass {
        public static StaticInnerClass singleton = new StaticInnerClass();
    }
}
