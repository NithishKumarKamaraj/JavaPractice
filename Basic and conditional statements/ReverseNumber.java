// A five-digit number is entered through the keyboard. Write a program to obtain the reversed number and to determine whether the original and reversed numbers are equal or not

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        int num, rev = 0, rem, original, reversed;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a five-digit number:");
        num = sc.nextInt();
        original = num;
        while (num != 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
            }
            reversed = rev;
            System.out.println("Reversed number " + reversed);
            if (original == reversed) {
                System.out.println("The original and reversed numbers are equal.");
                } 
            else {
                    System.out.println("The original and reversed numbers are not equal.");
                }
            }
}