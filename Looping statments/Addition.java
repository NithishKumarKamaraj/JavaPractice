//Write Java program to Find addition of N integer numbers

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i<=n;i++){
            System.out.println("Enter the integer: ");
            int num = sc.nextInt();
            sum = sum + num;
            }
            System.out.println("Sum of the integers is: "+sum);
    }
}