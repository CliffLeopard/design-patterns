package com.cliff.patterns.pt12_chain_responsibility;

/**
 * author:CliffLeopard
 * date:2021/9/7
 * time:08:56
 * email:precipiceleopard@gmail.com
 * link:
 */
public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor1();
        Processor processor2 = new Processor2();
        Processor processor3 = new Processor3();

        processor.setNext(processor2);
        processor2.setNext(processor3);

        Request request = new Request();
        Response response = processor.handleRequest(request);
    }
}
