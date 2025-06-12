// Write a program to input basic salary of an employee and calculate its Gross salary according to following:

// Basic Salary <= 10000 : HRA = 20%, DA = 80%
// Basic Salary <= 20000 : HRA = 25%, DA = 90%
// Basic Salary > 20000 : HRA = 30%, DA = 95%
// Gross Salary = Basic Salary + HRA + DA

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your basic salary");
        double bs= sc.nextDouble();
        double hra,da,gs;
        if(bs<=10000){
            hra=bs*0.2;
            da=bs*0.8;
        }
        else if(bs<=20000){
            hra=bs*0.25;
            da=bs*0.9;
        }
        else{
            hra=bs*0.3;
            da=bs*0.95;
            }
            gs=bs+hra+da;
            System.out.println("Gross Salary is "+gs);

    }
}