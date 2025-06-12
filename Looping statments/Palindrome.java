// Write a Program to Check Given String is a Palindrome or Not

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        String rev="";
        int len= str.length();
        for(int i=(len-1);i>=0;--i){
            rev=rev+str.charAt(i);

        }
        if (str.toLowerCase().equals(rev.toLowerCase())) {
            System.out.println(str + " is a palindrome");
        }
        else {
            System.out.println(str + " is not a palindrome");
        }
    }
}