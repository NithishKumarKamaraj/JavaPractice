package com.nk.polymorphism;

public class Main {
    public static void main(String[] args) {
        PolyParent poly= new PolyChild(56,"NK",89);

        PolyParent.welcome("Hi");
        poly.fun();
        poly.greet("NK");
        poly.greet("Name"+ 78);
    }
}
