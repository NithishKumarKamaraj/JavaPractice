// Write a code to get three numbers from the User and display the greatest number of three 
import java.util.Scanner;

public class CompareThreeNumbers{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first value");
        int a=sc.nextInt();
        System.out.println("Enter second value");
        int b=sc.nextInt();
        System.out.println("Enter third value");
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("A is greater");
        }
        else if(b>=c && b>=a){
            System.out.println("B is greater");
        }
        else {
            System.out.println("C is greater");
        }

    }
}