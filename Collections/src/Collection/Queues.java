package Collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q1= new ArrayDeque<>();
        q1.add(78);
        q1.offer(89);
        q1.offer(77);
        System.out.println(q1);
        q1.poll();
        System.out.println(q1.peek());

        System.out.println(q1);

        for (int i: q1){
            System.out.println(i) ;
        }
        Queue<Integer> q2= new PriorityQueue<>(q1);
        q2.offer(344);
        q2.poll();
        System.out.println(q2);
        System.out.println(q1);
    }
}
