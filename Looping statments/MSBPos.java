// Write Java program to Find the position of MSB bit of an integer number

import java.util.Scanner;

public class MSBPos {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int pos = 0;
    while (n >0){
        pos++;
        n = n >>1;
        
    }
    System.out.println("Position of MSB bit is " + (pos-1));
    }

}