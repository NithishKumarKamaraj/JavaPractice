// If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program to determine the youngest of the three

import java.util.Scanner;

public class AgeCompare {

    public static void main(String[] args) {
        int ramAge = 0, shyamAge = 0, ajayAge =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ram's age");
        ramAge = sc.nextInt();
        System.out.println("Enter Shyam's age");
        ramAge = sc.nextInt();
        System.out.println("Enter Ajay's age");
        ajayAge = sc.nextInt();
        if (ramAge<= shyamAge && ramAge<=ajayAge ) {
             System.out.println("Ram is youngest");
        }
        else if (shyamAge<=ramAge && shyamAge<=ajayAge){
            System.out.println("Shyam is youngest");
        }
        else {
            System.out.println("Ajay is youngest");
            }

    }

}