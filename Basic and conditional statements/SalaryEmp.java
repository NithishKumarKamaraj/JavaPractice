// Write a program to calculate the salary as per the following table

// Gender	Year of Service	Qualifications	Salary
// Male	>= 10	Post - Graduate	15000
// >= 10	Graduate	10000
// < 10	Post - Graduate	10000
// < 10	Graduate	7000
// Female	>= 10	Post - Graduate	12000
// >= 10	Graduate	9000
// < 10	Post - Graduate	10000
// < 10	Graduate	6000

import java.util.Scanner;

public class SalaryEmp {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Gender (Male/Female):");
    String gender = sc.next();
    System.out.println("Enter Year of Service:");
    int yearOfService = sc.nextInt();
    System.out.println("Enter Qualification (Post-Graduate/Graduate):");
    String qualification = sc.next();
    int salary = 0;
    if (gender.equals("Male") && yearOfService >=10 && qualification.equals("Post-Graduate")){
        salary = 15000;
    }
    else if (gender.equals("Male") && yearOfService >=10 && qualification.equals("Graduate")){
        salary = 10000;
    }
    else if (gender.equals("Male") && yearOfService<10 && qualification.equals("Post-Graduate")){
        salary=10000;
    }
    else if (gender.equals("Male") && yearOfService<10 && qualification.equals("Graduate")){
        salary = 7000;
    }
    else if (gender.equals("Female") && yearOfService >=10 && qualification.equals("Post-Graduate")){
        salary = 12000;
    }
    else if (gender.equals("Female") && yearOfService >=10 && qualification.equals("Graduate")){
        salary = 9000;
    }
    else if (gender.equals("Female") && yearOfService<10 && qualification.equals("Post-Graduate")){
        salary = 10000;
    }
    else if (gender.equals("Female") && yearOfService<10 && qualification.equals("Graduate")){
        salary = 6000;
    }
    else{
        System.out.println("Invalid Input");
    }
    System.out.println("Salary: "+salary);
    }
    
}