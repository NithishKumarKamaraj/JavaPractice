// Write a program to check whether a character is uppercase or lowercase alphabet
import java.util.Scanner;

public class LowerUpper {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a ch");
            char ch= sc.next().charAt(0);
            if(ch>='a' && ch<'z'){
                System.out.println("Lower case");
            }
            else if(ch>='A' && ch<='Z'){
                System.out.println("Upper case");
            }
            else {
                System.out.println("Not an alphabet");
            }
        }
}