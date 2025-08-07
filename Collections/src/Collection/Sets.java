package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set <Integer>s1= new HashSet<>();
        s1.add(89);
        s1.add(90);
        s1.add(71);
        s1.add(88);
        s1.add(88);
        s1.remove(90 );
        System.out.println(s1);
        for(int i: s1){
            System.out.println(i);
        }
        Set <Integer> s2= new LinkedHashSet<>(s1);
        s2.add(11);
        System.out.println(s2);
        s2.add(23);
        for(int i: s2){
            System.out.println(i);
        }
        s2.remove(11);
        System.out.println(s2);
        Set <Integer> s3= new TreeSet<>(s1);
        s3.addAll(s2);
        System.out.println(s3);
        s3.add(79);
        for(int i: s3){
            System.out.println(i);
        }
        s3.remove(11);
        System.out.println(s3);

    }
}
