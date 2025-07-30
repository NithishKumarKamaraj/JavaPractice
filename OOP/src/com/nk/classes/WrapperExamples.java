package com.nk.classes;

public class WrapperExamples {
    //Wrapper classes converts primitive data type to using it as objects
    public static void main(String[] args) {


        Integer num = 61;
        int s = num.hashCode();
        System.out.println(s);
//        final values cannot be changed
        final int b = 90;
//        b=89;
    final Student sk=new Student();
    sk.rollNo=2;
//    sk= new A();
//   We can edit the elements inside the class but cannot edit the reference variable
    A obj;
    for(int i=0;i<=1000000;i++){
        obj= new A("random");

    }
    }

}
class A{
//    final int a;
//    It should be initialized while creating it
    String name;

    public A(String name) {
//        System.out.println("Object created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object deleted");
//        it calls garbage collector in java it happens automtaically
    }
}
