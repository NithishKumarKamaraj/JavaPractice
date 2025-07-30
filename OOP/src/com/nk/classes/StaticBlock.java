package com.nk.classes;

public class StaticBlock {
    static  int a=6;
    static  int b;
    static {
// this will be printed once as static block run only once when the first object created
// when the class is loaded first time
        System.out.println("Inside Static block");
        b=a+2;
    }

    public static void main(String[] args) {
        StaticBlock obj= new StaticBlock();
        System.out.println(StaticBlock.a + " "+ StaticBlock.b);
        StaticBlock.b +=3;
        StaticBlock obj2=new StaticBlock();
        System.out.println(StaticBlock.a + " "+ StaticBlock.b);
        Stats s= new Stats(5);
        System.out.println(s.t);
    }
    //only inner classes can be static as it does not depend on any objects
   public static class Stats {
        int t;

        public Stats(int t) {
            this.t = t;
        }
    }

}
