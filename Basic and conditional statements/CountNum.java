// Write a Java program that reads an positive integer and count the number of digits
import java.util.Scanner;
public class CountNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
            }
            System.out.println("Number of digits: " + count);
    }
}
