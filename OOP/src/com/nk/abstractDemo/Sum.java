package com.nk.abstractDemo;

public class Sum extends abstractDemo implements  DemoInterface{
    int a;
    int b;

    @Override
    void sum() {
        int c= a+b;
    }

    @Override
    public void add() {
        int c=a+b;
    }

}
