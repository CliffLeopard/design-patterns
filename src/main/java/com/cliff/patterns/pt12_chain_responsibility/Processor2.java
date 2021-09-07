package com.cliff.patterns.pt12_chain_responsibility;

/**
 * author:CliffLeopard
 * date:2021/9/7
 * time:08:56
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Processor2 extends Processor {
    @Override
    public boolean filter(Request request) {
        return false;
    }

    @Override
    public Response echo(Request request) {
        return null;
    }
}
