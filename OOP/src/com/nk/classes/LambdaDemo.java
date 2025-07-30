package com.nk.classes;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaDemo{
    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<>();

            for (int i = 0; i < 6; i++) {
                items.add(i * 2);
            }
//            items.forEach((item) -> {
//                System.out.println(item + 1);
//            });
        Consumer<Integer> fun= (item)-> {
            System.out.println(item+1);
        };
            items.forEach(fun);
            Operation sum =(a, b)->(a+b);
            Operation sub=(a, b) -> (a-b);
            Operation product=(a, b) -> (a*b);
            Operation divide=(a, b) -> (a/b);
            LambdaDemo oper= new LambdaDemo();
            System.out.println(oper.operate(8,9,sum));
            System.out.println(oper.operate(80,65,sub));

    }
    private int operate(int a, int b , Operation op){
        return  op.oprate(a,b);
    }
}
interface  Operation{
    int oprate(int a, int b);
}