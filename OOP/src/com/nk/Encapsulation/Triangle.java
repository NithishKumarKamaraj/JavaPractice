package com.nk.Encapsulation;

public class Triangle {
    private int length1;
    private int length2;
    private int length3;

    public int getLength1() {
        return length1;
    }

    public void setLength1(int length1) {
        this.length1 = length1;
    }

    public int getLength2() {
        return length2;
    }

    public void setLength2(int length2) {
        this.length2 = length2;
    }

    public int getLength3() {
        return length3;
    }

    public void setLength3(int length3) {
        this.length3 = length3;
    }

    void perimeter() {
        int l1 = getLength1();
        int l2 = getLength2();
        int l3 = getLength3();
        int perimeterTriangle = l1 + l2 + l3;
        System.out.println(perimeterTriangle);
    }
}
