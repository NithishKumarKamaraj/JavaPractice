// Write a program to find all roots of a quadratic equation
// Formula b^2 - 4ac
// the program calculates the two roots using the quadratic formula (-b ± sqrt(b^2 - 4ac)) / (2a) 
// and prints them. If the discriminant is equal to 0, the program calculates the single root (-b / 2a)

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the coefficients of the quadratic equation (a, b, c):");
        double a=sc.nextDouble(), b=sc.nextDouble(), c= sc.nextDouble();
        double discriminant = b * b - 4 * a * c;
        double root1, root2;
        if (discriminant >0){
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.format("root 1= %.2f and root2 = %.2f", root1,root2);
        }
        else if (discriminant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.format("%.2f and root2 = %.2f", root1);
        }
        else {
            double real= -b/(2*a);
            double img =Math.sqrt(-discriminant)/(2*a);
            System.out.format("root1 = %.2f+%.2fi", real, img);
		    System.out.format("\nroot2 = %.2f-%.2fi", real, img);
            }
    }
}