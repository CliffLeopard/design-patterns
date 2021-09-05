package com.cliff.patterns.pt01_singleton;

public class DoubleCheck {
    private static volatile DoubleCheck singleton;

    private DoubleCheck() {

    }

    public static DoubleCheck getSingleton() {
        if (singleton == null) {
            synchronized (DoubleCheck.class) {
                if (singleton == null) {
                    singleton = new DoubleCheck();
                }
            }
        }
        return singleton;
    }
}
