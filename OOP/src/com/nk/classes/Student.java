package com.nk.classes;

public class Student {
    String name;
    int rollNo;
    double Marks;
    static int totalStudents;

    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.Marks = marks;
        Student.totalStudents +=1;
    }

    public Student() {
//       this.name="Name";
//       this.Marks=0.0;
//       this.rollNo=0;
        Student.totalStudents +=1;

    }
    Student(Student other){
        this.name=other.name;
        this.rollNo=other.rollNo;
        this.Marks= other.Marks;
        Student.totalStudents +=1;

    }
}
