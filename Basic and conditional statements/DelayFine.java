// A library charges a fine for every book returned late. For first 5 days the fine is 50 paise, for 6-10 days fine is one rupee and above 10 days fine is 5 rupees. If you return the book after 30 days your membership will be cancelled. Write a program to accept the number of days the member is late to return the book and display the fine or the appropriate message

import java.util.Scanner;

public class DelayFine {

    public static void main(String[] args) {
        double fine = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days you are late to return the book");
        int days = sc.nextInt();
        if (days>0 && days <=5 ){
            fine = 0.5 * days ;
        }
        else if (days >=6 && days<=10){
            fine = 1 * days;
        }
        else if (days >10){
            fine = 5 * days;
            if(days>=30){
                fine = 5* days;
                 System.out.println("Your membership will be cancelled");
            }

    }
        System.out.println("The fine is " + fine);
        

    }
}