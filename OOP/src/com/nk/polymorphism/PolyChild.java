package com.nk.polymorphism;

public class PolyChild extends  PolyParent{
    int sum;
    PolyChild(int roll, String name,int sum) {
        super(roll, name);
        this.sum=sum;
    }

    @Override
    void fun() {
        System.out.println("Inside child class");
    }
    void greet(String name, int roll){
        System.out.println("Parent Greet"+ name +roll);
    }
//static methods cannot be overridden but can be overloaded
    static  void welcome(String s){
        System.out.println("Inside child static");
    }

}
