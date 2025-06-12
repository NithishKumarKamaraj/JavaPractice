// Write a program to input all sides of a triangle and check whether triangle is valid or not
import java.util.Scanner;

public class TriangleSides {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            System.out.println("Enter the lengths of the three sides of the triangle: ");
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c=sc.nextInt();
            if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Triangle can be formed");
            }
            else{
            System.out.println("Triangle cannot be formed");
            }
    }
}