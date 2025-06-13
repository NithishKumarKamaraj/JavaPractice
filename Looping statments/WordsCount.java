// Write Java program to count total number of words in a string

import java.util.Scanner;

public class WordsCount {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();
    int count = 0;
    for (int i = 0; i<=str.length()-1 ;i++){
        if (str.charAt(i) == ' '){
            count++;
            }
    }
    System.out.println("Total number of words: "+(count+1));

    }
}