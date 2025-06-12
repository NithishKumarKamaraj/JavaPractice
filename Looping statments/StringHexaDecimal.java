// Write Java program to Print string in hexadecimal format

import java.util.Scanner;

public class StringHexaDecimal {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String str = sc.nextLine();
    System.out.println("Hexadecimal String");
    for(int i=0;i<str.length();i++){
        System.out.printf("%02X",(int)str.charAt(i));
    }
    System.out.println();
    }
}