// Write a Program to convert Hexadecimal to Octal number system

import java.util.Scanner;

public class OctalNumber {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Hexadecimal Number");
    String hexa = sc.nextLine().toUpperCase();
    int len=hexa.length();
    int decimal = 0;
    int base = 1;
    
    for (int i = len-1; i >=0 ;i--){
        char ch=hexa.charAt(i);
        int value = 0;
        if (ch>='0' && ch<='9') {
            value= ch-'0';
        }
        else if(ch>='A' && ch<='F'){
            value = ch - 'A' + 10;
        }
        decimal += value* base;
        base = base * 16;
    }
    StringBuilder octal= new StringBuilder();
    if(decimal==0){
        octal.append("0");
    }
    else{
        while(decimal>0){
            int rem = decimal % 8;
            octal.insert(0, rem);
            decimal = decimal / 8;
        
        }
    }
    
        System.out.println("Octal equivalent: " + octal.toString());

    }
}