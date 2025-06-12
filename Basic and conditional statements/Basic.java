// Basic Data types and getting input

import java.util.Scanner;

class Basic{
  
    public static void main(String[] args){
        byte num1=90;
        short num2=8999;
        int num3=2879071;
        long num4=275673134;
        float num5= 66.98f;
        double num6= 789123.091;
        char ch='h';
        String str="hello";
        boolean bln=false;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(ch);
        System.out.println(str);
        System.out.println(bln);
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a line");
        String strs=sc.nextLine();
        System.out.println(strs);
        System.out.println("Enter a number");
        int num7=sc.nextInt();
        System.out.println(num7);
        System.out.println("Enter a Strings");
        String str1=sc.next();
        String str2=sc.next();
        System.out.println(str1);
        System.out.println(str2);
    
    }
}