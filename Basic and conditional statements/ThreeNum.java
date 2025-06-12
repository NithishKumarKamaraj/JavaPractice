// Write a Java program that accepts three numbers and check All numbers are equal or not
import java.util.Scanner;
public class ThreeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        if(a==b && b==c){
            System.out.println("All numbers are equal");
        }
        else{
            System.out.println("All numbers are not equal");
            }
    }
}