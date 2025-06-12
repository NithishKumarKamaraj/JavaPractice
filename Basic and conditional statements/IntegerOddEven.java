// Write a code to get a number from User and display the number as ODD or EVEN

import java.util.Scanner;

public class IntegerOddEven {

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int a= sc.nextInt();
        if(a>0){
            if(a%2==0){
                System.out.println("Positive and even");
            }
            else{
                System.out.println("Positive and odd");
            }
        }
        else{
            System.out.println("Negative");
        }
    }
}