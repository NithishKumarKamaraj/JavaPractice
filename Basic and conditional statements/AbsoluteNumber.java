// Find the absolute value of a number entered through the keyboard
// num = (-1)*num;

import java.util.Scanner;

public class AbsoluteNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if(number>0){
            number=(-1)*number;

        }
        System.out.println("Absolute number "+ number );
    }
}