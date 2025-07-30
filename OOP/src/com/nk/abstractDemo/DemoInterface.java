package com.nk.abstractDemo;

public interface DemoInterface {
    void add();
//    multiple inheritance is allowed inside the interfaces
// variables are static and final by default
//    every single method is abstract
//    static methods are allowed

    int a=18;
    int b=5;
    static void sub(){
        int c=a-b;
    }
}
