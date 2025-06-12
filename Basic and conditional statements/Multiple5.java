// Write a Java program to check whether the given integer is a multiple of 5
import java.util.Scanner;
public class Multiple5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num % 5 == 0) {
            System.out.println(num + " is a multiple of 5");
            }
        else {
            System.out.println(num + " is not a multiple of 5");
            }
    }
}