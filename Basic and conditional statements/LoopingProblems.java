// Write a program which takes two values x and y. Prints x for y number of times.

// Input:

// 2 

// 3

// Expected Output

// 2

// 2

// 2

// Explanation - 2 is x and 3 is y in the input. So 2 is printed 3 times on the output.

// Write a program to take x and print multiples of x till 1000.
// Input:

// 100

// Expected Output:

// 100

// 200

// 300

// 400

// 500

// 600

// 700

// 800

// 900

// 1000

// Explanation - Input is 100, multiples of 100 is 100*1, 100*2, 100*3 and so on till 1000.

// Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.
// Input

// Nandy

// Raja

// 5

// Expected output:

// NandyRaja

// NandyRaja

// NandyRaja

// NandyRaja

// NandyRaja

// Explanation - Nandy is the firstName, Raja is the lastName and n is 5, so the expected output has NandyRaja printed 5 times.
import java.util.Scanner;

public class LoopingProblems{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        for(int i=1;i<=y;i++){
            System.out.println(x);
        }
        for(int i=sc.nextInt(); i<=1000; i=i+100){
            System.out.println(i);
        }
         String firstName=sc.next();
         String secondName=sc.next();
         int n=sc.nextInt();
         int i=0;
         while(i<n){
        System.out.println(firstName + secondName);
        i++;
        }
    }
}