package com.cliff.patterns;

public class Main {
    public static void main(String[] args) {
        Main father = new Main("Cliff", 23);
        Main child = new Main("Trump", 60);
        father.setChild(child);
        System.out.println(father.toString());
    }

    private final String name;
    private final int age;
    private Main child;

    public Main(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setChild(Main child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "{\n" +
                "   name='" + name + '\'' + ",\n"+
                "   age=" + age +",\n"+
                "   child=" + (child == null ? "null" : child.toString())+
                "\n}";
    }
}


