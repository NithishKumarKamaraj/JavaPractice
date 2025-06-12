// Write a program to convert Hexadecimal to Decimal number system

import java.util.Scanner;

public class HexaDecimal {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Hexadecimal Number");
        String hexa = sc.next().toUpperCase();
        int len= hexa.length();

        int base=1;
        int decimal=0;
        System.out.println("Hexadecimal input: " + hexa + ", Length: " + len);
        for(int i= len-1;i>=0;i--){
            char ch = hexa.charAt(i);
            if(ch>='0' && ch <='9'){
                decimal +=(ch-'0')*base;
               
            }
            else if(ch>='A'&& ch<='F'){
                decimal +=(ch -'A'+10)*base;
            }
            base= base*16;
        }
        System.out.println("Decimal Number is " +decimal);
        }
}