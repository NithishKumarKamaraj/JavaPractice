// Write Java program to Count the total HIGH bits in the given number

import java.util.Scanner;

public class CountHighBits {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    int count = 0;
    while (n >0){
        if ((n&1)==1) {
           count++; 
        }
        n = n >>1;
    }
    System.out.println("Total HIGH bits: "+count);
    }
}