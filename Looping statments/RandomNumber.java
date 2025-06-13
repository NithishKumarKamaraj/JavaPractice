// Write Java program to Generate Random Numbers from 0 to given Range

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        Random rand = new Random();
        for(int i=0;i<5;i++){
            System.out.println(rand.nextInt(n));
        }
    }
}