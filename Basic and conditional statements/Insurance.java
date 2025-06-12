// A company insures its drivers in the following cases:

// If the driver is married
// If the driver is unmarried, male & above 30 years of age
// If the driver is unmarried, female & above 25 years of age

import java.util.Scanner;

public class Insurance {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age of the driver:");
    int age = sc.nextInt();
    System.out.println("Enter the gender of the driver M/F");
    char gender= sc.next().charAt(0);
    System.out.println("Enter the marital status of the driver Y/N");
    char maritalStatus = sc.next().charAt(0);
    if((maritalStatus=='y'|| maritalStatus=='Y')){
        System.out.println("The driver is insured");
    }
    else if((gender=='m'|| gender=='M') && (age>30) && (maritalStatus=='n' || maritalStatus=='N')){
        System.out.println("The driver is insured");
    }
    else if((gender=='f'|| gender=='F') && (age>25) && (maritalStatus=='n'|| maritalStatus=='N')){
        System.out.println("The driver is insured");
    }
    else{
        System.out.println("The driver is not insured");
        }
    }
}