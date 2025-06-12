//  Write Java program to Count the number of bits to be flipped to convert a number to another number

import java.util.Scanner;

public class CountNumberBits {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    int num1 = sc.nextInt();
    System.out.println("Enter the second number");
    int num2 = sc.nextInt();
    int count=0;
    while (num1>0 || num2>0) {
        int bit1 = num1 & 1;
        int bit2 = num2 & 1;
        if (bit1 != bit2) {
            count++;
            }
            num1 = num1 >> 1;
            num2 = num2 >> 1;
        
    }
    System.out.println("Number of bits to be flipped: "+count);
    }
}