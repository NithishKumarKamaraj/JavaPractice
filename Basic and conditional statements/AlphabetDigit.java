// Write a program to input any character and check whether it is alphabet, digit or special character
import java.util.Scanner;

public class AlphabetDigit {

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter something");
        char ch= sc.next().charAt(0);
        if (ch>='a'&& ch<='z'|| ch>='A' && ch<='Z') {
            System.out.println("This is a Alphabet");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("This is a digit");

        }
        else{
            System.out.println("This is a special character");
        }
    }
}