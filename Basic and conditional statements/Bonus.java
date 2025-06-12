// The current year and the year in which the employee joined the organization are entered through the keyboard. If the number of years for which the employee has served the organization is greater than 3 then a bonus of Rs. 2500/- is given to the employee. If the years of service are not greater than 3, then the program should do nothing

import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Current year");
    int currentYear = sc.nextInt();
    System.out.println("Year in which the employee joined the organisation");
    int joinedYear = sc.nextInt();
    if((currentYear-joinedYear)>3){
        System.out.println("Bonus of Rs. 2500/- is given to the employee");
    }
    else{
        System.out.println("No bonus is given");
    }
    
    }
}
