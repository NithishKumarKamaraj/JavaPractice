// Write a code to find the maximum of 3 numbers
import java.util.Scanner;

public class MaxOfThreeNum {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        System.out.println("Enter third number: ");
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("Maximum number is A: "+a);
        }
        else if(b>=c && b>=a){
            System.out.println("Maximum number is B: "+b);
        }
        else{
            System.out.println("Maximum number is C: "+c);
        }
}
}