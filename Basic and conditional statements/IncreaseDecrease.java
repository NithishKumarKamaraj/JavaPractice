// Write a java program that accepts three numbers from the user and check if numbers are in "increasing" or "decreasing" order
import java.util.Scanner;
public class IncreaseDecrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number");
        int num3 = sc.nextInt();
        if (num1 < num2 && num2 < num3){
            System.out.println("Numbers are in increasing order");
        }
        else if (num1 > num2 && num2> num3){
            System.out.println("Numbers are in decreasing order");
        }
        else {
            System.out.println("Numbers are neither in increasing nor decreasing order");
            }
    }

}