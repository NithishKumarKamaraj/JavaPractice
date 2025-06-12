// Write a program to check whether a triangle can be formed with the given values for the angles
import java.util.Scanner;

public class Triangle{
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three angles");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b+c==180){
            System.out.println("Triangle can be formed");
        }
        else{
            System.out.println("Triangle cannot be formed");
        }
    }
}