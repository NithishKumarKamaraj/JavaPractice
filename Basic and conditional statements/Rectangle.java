// Given the length and breadth of a rectangle, write a program to find whether the area of the rectangle is greater than its perimeter. For example, the area of the rectangle with length = 5 and breadth = 4 is greater than its perimeter

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        int breadth = sc.nextInt();
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        if (area >perimeter){
            System.out.println("Area is greater than perimeter");
        }
        else{
            System.out.println("Perimeter is greater than area");
            }
    }
}