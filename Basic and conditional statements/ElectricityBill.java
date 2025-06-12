//  Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:

// For first 50 units Rs. 0.50/unit
// For next 150 units Rs. 0.75/unit
// For next 250 units Rs. 1.20/unit
// For unit above 250 Rs. 1.50/unit
// An additional surcharge of 20% is added to the bill

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units consumed:");
        int units = sc.nextInt();
        float charge;
        if(units<=50){
            charge = units*0.50f;
        }
        else if(units<=150){
            charge = units*0.75f;
        }
        else if(units<=250){
            charge = units*1.20f;
        }
        else{
            charge = units*1.50f;
        }
        float surcharge = charge*0.2f;
        charge= charge + surcharge ;
       System.out.println("Total Current Bill is "+ charge);
    }
}