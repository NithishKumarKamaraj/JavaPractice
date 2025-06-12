//Converstion from different data types to string and string to differnet types

public class DataTypes{
    public static void main(String[] args) {
         byte a= 5;
         String s= Byte.toString(a);
         System.out.println(s);
         short b=6;
         String s1=Short.toString(b);
         System.out.println(s1);
         int c=7;
         String s2=Integer.toString(c);
         System.out.println(s2);
         double d=8.2;
         String s3=Double.toString(d);
         System.out.println(s3);
         long e= 9;
         String s4=Long.toString(e);
         System.out.println(s4);
         float f= 8.7f;
         String s5=Float.toString(f);
         System.out.println(s5);
         String s6= "10";
         short g= Short.parseShort(s6);
         System.out.println(g);
         String s7= "11";
         byte h=Byte.parseByte(s7);
         System.out.println(h);
         String s8="12.5";
         float i=Float.parseFloat(s8);
         System.out.println(i);
         String s9= "13";
         long j=Long.parseLong(s9);
         System.out.println(j);
         String s10="14.5";
         double k=Double.parseDouble(s10);
         System.out.println(k);
         String s11="15";
         int l=Integer.parseInt(s11);
         System.out.println(l);
    }
}