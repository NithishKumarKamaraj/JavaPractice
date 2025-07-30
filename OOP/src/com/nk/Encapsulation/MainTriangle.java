package com.nk.Encapsulation;

public class MainTriangle {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        triangle.setLength1(60);
        triangle.setLength2(60);
        triangle.setLength3(60);
        triangle.perimeter();
        System.out.println(triangle.getLength3());


    }
}
