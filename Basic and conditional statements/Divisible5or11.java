// Write a program to check whether a number is divisible by 5 and 11 or not
import java.util.Scanner;

public class Divisible5or11 {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a number");
    int n = sc.nextInt();
    if(n%5==0 || n%11==0){
        System.out.println("The number is divisible by 5 or 11");
    }
    else{
        System.out.println("The number is not divisible by 5 or 11");
    }
    }

}