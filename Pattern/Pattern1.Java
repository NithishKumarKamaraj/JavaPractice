import java.util.Scanner;

public class Pattern1{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number");
        int n = sc.nextInt();
        if(n>=0 && n<=100){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                    System.out.println(" ");
            }

        }
        else{
            System.out.println("Invalid input");
        }
    }
}