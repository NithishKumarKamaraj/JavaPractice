// Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:

// Percentage >= 90% : Grade A
// Percentage >= 80% : Grade B
// Percentage >= 70% : Grade C
// Percentage >= 60% : Grade D
// Percentage >= 40% : Grade E
// Percentage < 40% : Grade F

import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {
        int physics, chemistry, biology, mathematics, computer;
        double total,percentage;
        char grade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks of Physics: ");
        physics = scanner.nextInt();
        System.out.println("Enter marks of chemistry");
        chemistry = scanner.nextInt();
        System.out.println("Enter marks of biology");   
        biology=scanner.nextInt();
        System.out.println("Enter marks of mathematics");
        mathematics = scanner.nextInt();
        System.out.println("Enter marks of computer");
        computer = scanner.nextInt();
        total = physics + chemistry + biology + mathematics + computer;
        percentage = total / 5.0;
        if (percentage >=90){
        grade = 'A';
        }
        else if (percentage >=80){
        grade = 'B';
        }   
        else if (percentage >=70){
        grade = 'C';
        }
        else if (percentage >=60){
        grade = 'D';
        }
        else if (percentage >=40){
        grade = 'E';
        }
        else{
        grade = 'F';
        }
        System.out.println("Total:" +total);  
        System.out.println("Percentage: "+percentage);
        System.out.println("Grade: "+grade);


    }
}