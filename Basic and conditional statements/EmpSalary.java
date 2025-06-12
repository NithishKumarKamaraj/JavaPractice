// . If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA = 98% of basic salary. If the employee's salary is input through the keyboard write a program to find his gross salary

import java.util.Scanner;

public class EmpSalary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary of the employee");
        int bs = sc.nextInt();
        double hra,da,gs;
        if(bs<1500){
            hra=bs*0.1;
            da=bs*0.9;
            gs=bs+hra+da;
            System.out.println("Gross salary is "+gs);
        }
        else{
            hra=500;
            da=bs*0.98;
            gs=bs+hra+da;
            System.out.println("Gross salary is "+gs);
        }
        
    }
}