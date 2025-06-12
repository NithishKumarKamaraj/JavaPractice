// Write a Program to print Factors of a Negative Integer

import java.util.Scanner;

public class NegativeFactors {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a negative integer: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Factors of " + n+ " are:");
        for(int i=1;i<=Math.abs(n);i++){
            if(n%i==0){
                System.out.println(-i+" ");
                }
        }
    }
}