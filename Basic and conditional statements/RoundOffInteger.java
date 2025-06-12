// Write Java program to Round off an integer number to the next lower multiple of 2

import java.util.Scanner;

public class RoundOffInteger {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer number: ");
    int num = sc.nextInt();
    int result = num - (num % 2);
    System.out.println("The next lower multiple of 2 is: " + result);
    
    }
}