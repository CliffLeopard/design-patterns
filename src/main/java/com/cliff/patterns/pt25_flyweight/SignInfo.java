package com.cliff.patterns.pt25_flyweight;

/**
 * author:CliffLeopard
 * date:2021/9/16
 * time:07:51
 * email:precipiceleopard@gmail.com
 * link:
 */
public class SignInfo {
    private String id, location, subject, postAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }
}
