// Write a Program to check Armstrong numbers or Not

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        int count = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
            }
        temp = n;
          while (temp > 0) {
            int rem = temp % 10;
            int power=1;
            for (int i = 0; i<count;i++){
                power *=rem;
            }
                sum +=power;
                temp /= 10;
                }
                if (n == sum) {
                    System.out.println(n + " is an Armstrong number");
                    } 
                else {
                    System.out.println(n + " is not an Armstrong number");
                    }
    }
}