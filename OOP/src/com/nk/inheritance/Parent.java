package com.nk.inheritance;

public class Parent {
    int a;
    int b;
    void fun(){
        System.out.println("Hi");
    }

    public Parent(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Parent(Parent other) {
        this.a=other.a;
        this.b=other.b;

    }
}
