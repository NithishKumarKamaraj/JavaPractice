import java.util.Scanner;

public class Pattern11 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value of N");
        int n = sc.nextInt();
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<= (2*i-1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=1;i<= n; i++){
            for(int j=1; j<= i-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<= (2*n)-(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}