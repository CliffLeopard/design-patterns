package com.cliff.patterns.pt12_chain_responsibility;

/**
 * author:CliffLeopard
 * date:2021/9/7
 * time:08:50
 * email:precipiceleopard@gmail.com
 * link:
 */
public abstract class Processor {
    protected Processor next;

    public final Response handleRequest(Request request) {
        Response response = null;
        if (filter(request))
            response = echo(request);
        else
            response = this.next.handleRequest(request);

        return response;
    }

    public final void setNext(Processor processor) {
        this.next = processor;
    }

    public abstract boolean filter(Request request);

    public abstract Response echo(Request request);
}
