// Write Java program to Extract words from a given sentence

import java.util.Scanner;

public class ExactWords {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a sentence:");
    String sentence = sc.nextLine();
    String[] words = sentence.split("\\s+");
    for (String word : words) {
        System.out.println(word);
    }
    }
}