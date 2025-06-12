// Write a Program to print Factors of a Positive Integer

import java.util.Scanner;

public class PositiveFactors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Positive Integer: ");
        int n = sc.nextInt();
        System.out.println("Factors of " + n + " are: ");
        for (int i = 1; i <=n; i++){
            if (n % i == 0) {
                System.out.print(i + " ");
                }
        }
    }

}