//Write a program to find 1s complement of a number in java

import java.util.Scanner;

public class OnesComplement{

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Binary number: ");
    String binary = sc.nextLine();
    String oneComplement = "";
    for(int i=0;i<binary.length();i++){
        if(binary.charAt(i)=='0'){
            oneComplement +='1';
        }
        else{
            oneComplement +='0';
        }
    }
    System.out.println("1's complement of the number is: "+oneComplement);
    
    }
}