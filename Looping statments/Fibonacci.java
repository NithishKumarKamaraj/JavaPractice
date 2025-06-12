// Write a program to print fibonacci series upto n terms

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of terms");
    int n = sc.nextInt();
    int t1 = 0, t2 = 1, nextTerm = 0;
    System.out.println("Fibonacci Series: ");
    for (int i = 1; i <=n ;i++){
            System.out.print(nextTerm + " ");
            t1 = t2;
            t2 = nextTerm;
            nextTerm = t1 + t2;
    }
    
    }
}