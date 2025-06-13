// Write Java program to print used different characters (letters) in a string

import java.util.Scanner;

public class CharCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        str= str.toUpperCase();
        char ch ;
        int count = 0;
        System.out.println("Characters Used");
        for (ch ='A'; ch<'Z';ch++){
            for(int i=0;i<str.length();i++){

            if (ch== str.charAt(i)){
                System.out.println(ch+ " ");
                count++;
            }
            }
        }
        System.out.println("Number of different characters in the string: " + count);
    }
}