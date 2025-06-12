// Write a code find out the maximum of two numbers
import java.util.Scanner;

public class MaxOfTwoNum {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a= sc.nextInt();
        int b=sc.nextInt();
        if(a>=b){
            System.out.println("A is greater");
        }
        else{
            System.out.println("B is greater");
        }

}
}