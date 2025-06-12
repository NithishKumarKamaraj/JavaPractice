// . In a company, worker efficiency is determined on the basis of the time required for a worker to complete a particular job. If the time taken by the worker is between 2 – 3 hours, then the worker is said to be highly efficient. If the time required by the worker is between 3 – 4 hours, then the worker is ordered to improve speed. If the time taken is between 4 – 5 hours, the worker is given training to improve his speed, and if the time taken by the worker is more than 5 hours, then the worker has to leave the company. If the time taken by the worker is input through the keyboard, find the efficiency of the worker

import java.util.Scanner;

public class EmpTime {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the time taken by the worker(in hours)");
    double time = sc.nextDouble();
    if (time < 0) {
        System.out.println("Invalid input. Time cannot be negative.");
    }
    else if (time < 2) {
        System.out.println("Invalid time. Time should be at least 2 hours.");
    }
    else if (time >=2 && time<=3){
        System.out.println("The worker is highly efficient");
    }
    else if(time>3 && time<=4){
        System.out.println("The worker is ordered to improve speed");
    }
    else if(time>4 && time<=5){
        System.out.println("The worker is given training to improve his speed");
    }
    else{
        System.out.println("The worker has to leave the company");
    }
    }
}