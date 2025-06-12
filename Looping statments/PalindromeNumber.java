// Write a Program to Check Given Number is a Palindrome or Not

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
            }
            if (temp == sum) {
                System.out.println(temp + " is a palindrome number");
                } 
            else {
                System.out.println(temp + " is not a palindrome number");
                }
    }
}