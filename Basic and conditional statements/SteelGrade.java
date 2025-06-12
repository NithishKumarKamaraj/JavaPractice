// A certain grade of steel is graded according to the following conditions

// Hardness must be greater than 50
// Carbon content must be less than 0.7
// Tensile strength must be greater than 5600
// The grades are as follows:

// Grade is 10 if all three conditions are met
// Grade is 9 if conditions (i) and (ii) are met
// Grade is 8 if conditions (ii) and (iii) are met
// Grade is 7 if conditions (i) and (iii) are met
// Grade is 6 if only one condition is met
// Grade is 5 if none of the conditions are met
// Write a program, which will require the user to give values of hardness, carbon content and tensile strength of the steel under consideration and output the grade of the steel

import java.util.Scanner;

public class SteelGrade {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the hardness of the steel: ");
        int hardness = sc.nextInt();
        System.out.println("Enter the carbon content of the steel: ");
        double carbon = sc.nextDouble();
        System.out.println("Enter the tensile strength of the steel: ");
        int tensile = sc.nextInt();
        int grade = 0;
        if(hardness>50 && carbon<0.7 && tensile>5600){
            grade = 10;
        }
        else if(hardness>50 && carbon<0.7){
            grade = 9;
        }
        else if(carbon<0.7 && tensile>5600){
            grade = 8;
        } 
        else if(hardness>50 && tensile>5600){
            grade = 7;
        }
        else if(hardness>50 || carbon<0.7 || tensile>5600){
            grade = 6;
        }
        else{
            grade = 5;
            }
            System.out.println("The grade of the steel is: "+grade);
            
    
    }
}