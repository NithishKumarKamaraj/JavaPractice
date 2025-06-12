// Write Java program to print bits that need to be flipped to convert a number to another number

import java.util.Scanner;

public class ConvertNumber {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int count = 0;
        int temp = num1 ^ num2;
        while (temp != 0) {
            count++;
            temp = temp & (temp - 1);
            }
            System.out.println("Number of bits to be flipped: " + count);
    }
            
}