// reverse of the string as output.

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a string:");
       String str = sc.nextLine();
       String reverseStr="";
       for(int i=0; i< str.length();i++){
        reverseStr= str.charAt(i) +reverseStr;
       }
       System.out.println("Reversed String" + reverseStr);
    }
   
}