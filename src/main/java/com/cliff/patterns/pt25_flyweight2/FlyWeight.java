package com.cliff.patterns.pt25_flyweight2;

/**
 * author:CliffLeopard
 * date:2021/9/16
 * time:08:06
 * email:precipiceleopard@gmail.com
 * link:
 */
public abstract class FlyWeight {
    private String intrinsic;
    private final String extrinsic;

    public FlyWeight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public abstract void operator();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
