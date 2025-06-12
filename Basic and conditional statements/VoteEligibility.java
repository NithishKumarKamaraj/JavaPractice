//Write a code to get the age from the User and check if User is eligible to vote or not

import java.util.Scanner;

public class VoteEligibility{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
    }
}