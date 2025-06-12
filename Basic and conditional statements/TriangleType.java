// Write a program to check whether the triangle is equilateral, isosceles or scalene triangle
import java.util.Scanner;

public class TriangleType {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter the three angles of the triangle: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b+c==180){
        if(a==b && a==c){
            System.out.println("This is a equilateral triangle");
        }
        else if(a==b || b==c || c==a){
            System.out.println("This is a isosceles triangle");
        }
        else{
            System.out.println("This is scalene triangle");
        }
    }
    else{
        System.out.println("Triangle cannot be formed");
    }
    
    }
}