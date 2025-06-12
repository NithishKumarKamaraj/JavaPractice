// Write a Java program to create a simple calculator

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the first number: ");
     int num1 = scanner.nextInt();
     System.out.println("Enter the second number: ");
     int num2 = scanner.nextInt();
     System.out.println("Enter the operator (+, -, *, /): ");
     String operator = scanner.next().charAt(0);
     int result = 0;
     switch (operator) {
        case "+":
        result = num1 + num2;
        break;
        case "-":
        result = num1 - num2;
        break;
        case "*":
        result = num1 * num2;
        break;
        case "/":
        if (num2 != 0) {
            result = num1 / num2;
            }
            else{
            System.out.println("Error: Division by zero is not allowed.");
            }
            break;
            default:
            System.out.println("Error: Invalid operator.");
            break;
     }
     System.out.println("Result: " + result);
     
}

}