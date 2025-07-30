package com.nk.ExceptiongHandling;

public class ExceptionDemo {
    public static void main(String[] args) throws Exception {
       int a=7;
       int b=0;
        try {
//            divide(a,b);
            throw  new Exception("This is wanted");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("normal Exception");
        }
        finally {
            System.out.println("This will be executed always");
        }
    }
    static int divide(int a, int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Don't divide by Zero");
        }
        return a / b;
    }
}
