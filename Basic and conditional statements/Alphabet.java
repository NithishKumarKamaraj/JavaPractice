//Write a program to check whether a character is alphabet or not
import java.util.Scanner;

public class Alphabet {

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a character");
        char c=sc.next().charAt(0);
        if (c>='a' && c<='z' || c>='A' && c<='Z'){
            System.out.println("It is a Alphabet");
        }
        else{
            System.out.println("It is not a Alphabet");
        }
    }
}