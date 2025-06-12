// Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.

import java.util.Scanner;

public class Input {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a =sc.nextInt();
        System.out.println(a);
        System.out.println("Enter a Name");
        String name = sc.next();
        System.out.println(name);
        System.out.println("Enter a char");
        char cha=sc.next().charAt(0);
        System.out.println(cha);


    }

}