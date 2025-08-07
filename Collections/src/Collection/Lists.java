package Collection;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
//        List <Integer>list1= new ArrayList<>();
//        list1.add(23);
//        list1.add(1,78);
//        list1.add(23);
//        System.out.println(list1);
//        list1.remove(1);
//        System.out.println(list1.lastIndexOf(2));
//        list1.sort((o1, o2) -> o1 + o2);
//        System.out.println(list1);
//        System.out.println(list1.get(1));
//        System.out.println(list1.isEmpty());
//        for(int i: list1){
//            System.out.println(i);
//        }
//        List <Integer> list2 = new Vector<>();
//        list2.add(56);
//        list2.add(32);
//        list2.add(2,98);
//        list2.remove(0);
//        System.out.println(list2);
//        for(int i: list2){
//            System.out.println(i);
//        }
        List <Integer> list3= new LinkedList<>();
        list3.add(997);
        list3.add(1,79);
        list3.add(89);
        System.out.println(list3);
        list3.remove(0);
        System.out.println(list3);
        for (int i: list3) {
            System.out.println(i);
        }

    }
}
