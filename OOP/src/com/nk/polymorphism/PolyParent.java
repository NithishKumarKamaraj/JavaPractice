package com.nk.polymorphism;

public  class PolyParent {
    int roll;
    String name;
    PolyParent(int roll, String name) {
        this.roll= roll;
       this.name= name;
    }
    void fun(){
        System.out.println("Inside Parent ");
    }

    void greet(String name){
        System.out.println("Parent Greet "+ name);
    }
   static void welcome(String hi){
       System.out.println("Inside static");
   }


}
