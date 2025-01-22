package Questions.B_Collections;

import java.util.PriorityQueue;

public class F_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        p.add(8);
        p.add(10);
        p.add(4);
        p.add(5);
        p.add(3);

        System.out.println("Head of Queue : " + p.peek());
        System.out.println("Element in the Priority Queue:");
        while (!p.isEmpty()) {
            System.out.print(p.poll() + " ");
        }
        System.out.println();
    }
}
