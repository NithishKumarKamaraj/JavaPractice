package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        Map<Integer,String> m1 = new HashMap<>();
        m1.put(1,"Nk");
        m1.put(2,"Sk");
        m1.put(4,"Rk");
        m1.put(3,"Pk");
        System.out.println(m1);
        for (int i: m1.keySet()){
            System.out.println(i);
        }
        for (String i: m1.values()){
            System.out.println(i);
        }
        m1.remove(2);
        m1.replace(4,"Ek");
        System.out.println(m1);
        Map<String,Integer> m2= new TreeMap<>();
        m2.put("Nk",1);
        m2.put("Sk",2);
        m2.put("Rk",7);
        m2.put("Pk",4);
        System.out.println(m2);
        for (int i: m2.values()){
            System.out.println(i);
        }
        for(String s:m2.keySet()){
            System.out.println(s);
        }
        Map<String,Integer> m3= new LinkedHashMap<>();
        m3.put("Nk",1);
        m3.put("Sk",2);
        m3.put("Rk",7);
        m3.put("Pk",4);
        System.out.println(m3);
        for (int i: m3.values()){
            System.out.println(i);
        }
        for(String s:m3.keySet()){
            System.out.println(s);
        }

    }
}
