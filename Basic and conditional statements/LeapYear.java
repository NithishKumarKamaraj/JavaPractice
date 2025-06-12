// Write a program to check whether a year is leap year or not
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a year");
    int a= sc.nextInt();
    if(a%4==0){
        System.out.println("The year is leap Year");
    }
    else{
        System.out.println("The year is not a leap year");
    }
    }

}