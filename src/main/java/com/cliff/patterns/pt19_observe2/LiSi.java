package com.cliff.patterns.pt19_observe2;

import java.util.Observable;
import java.util.Observer;

/**
 * author:CliffLeopard
 * date:2021/9/15
 * time:08:14
 * email:precipiceleopard@gmail.com
 * link:
 */
public class LiSi implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("update:o:" + o.toString() + " arg:" + arg.toString());
    }

    @Override
    public String toString() {
        return "LiSi";
    }
}
