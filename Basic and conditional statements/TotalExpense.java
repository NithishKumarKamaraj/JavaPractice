// while purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 100.
// If quantity and price per item are input through the keyboard, 
// write a program to calculate the total expenses

import java.util.Scanner;

public class TotalExpense {

    public static void main(String[] args) {
        float quantity, price,expense = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of items: ");
        quantity = sc.nextFloat();
        System.out.println("Enter the price per item: ");
        price = sc.nextFloat();
        if (quantity >100){
            expense=  quantity*price;
            expense=expense-(expense *0.1f);
        }
        else{
            expense=quantity*price;
        }
        System.out.println("Total expenses: " + expense);
        }
}