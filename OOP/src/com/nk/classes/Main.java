package com.nk.classes;

public class Main {
    public static void main(String[] args) {
        //just declaring
        Student pk;
//        System.out.println(pk.Marks);
        Student nk= new Student();
        nk.name="Nithish";
        nk.Marks=80.7;
        nk.rollNo=5;
        System.out.println(nk.Marks + " " + nk.rollNo + " " +nk.name);
        Student rk= new Student("Rahul",12,89.2);
        System.out.println(rk.Marks + " " + rk.rollNo + " " +rk.name);
        Student jk= new Student();
        System.out.println(jk.Marks + " " + jk.rollNo + " " +jk.name);
        Student ck= new Student(nk);
        System.out.println(ck.Marks + " " + ck.rollNo + " " +ck.name);
        System.out.println(Student.totalStudents);


    }
    //Static is not depended on objects
    static void age(){
//it depend on objects so this is not possible
        //        greet();
    }
    void greet(){
//        it does not depend on object
        age();
    }
}
