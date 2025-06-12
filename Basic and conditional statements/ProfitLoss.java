// Write a program to calculate profit or loss

import java.util.Scanner;

public class ProfitLoss {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the cost price of the item:");
        double cp = sc.nextDouble();
        System.out.println("Enter the selling price of the item:");
        double sp = sc.nextDouble();
        if (sp >cp){
            double profit = sp-cp;
        System.out.println("Profit is: " + profit);
        }
        else if (sp < cp){
            double loss = cp-sp;
        System.out.println("Loss is: " + loss);
        }
        else {
            System.out.println("No profit or loss");
        }
    }
}