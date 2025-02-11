package com.example.demo.product;

public class OverrideDemo {
}

class Parent {
    public void method() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override //어노테이션은 바로밑에있는애한테만영향미침
    public void method() {
        System.out.println("child");
    }
}