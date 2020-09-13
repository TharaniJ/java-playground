package tj.playground.java.datastructure;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String [] args) {

        Queue<Integer> numberQueue = new PriorityQueue<>();

        // Add elements
        numberQueue.add(10);
        numberQueue.add(20);
        numberQueue.add(30);
        numberQueue.add(40);

        // Print elements
        System.out.println("Peeking first number : " + numberQueue.peek());
        System.out.println("Poll first number : " + numberQueue.poll());
        System.out.println("Poll second number : " + numberQueue.poll());
        System.out.println("Poll third number : " + numberQueue.poll());
        System.out.println("Poll fourth number : " + numberQueue.poll());

        System.out.println("Is Queue Empty? " + numberQueue.isEmpty());

        System.out.println("");


        Queue <String> stringQueue = new PriorityQueue<>();
        stringQueue.add("One");
        stringQueue.add("Second");
        stringQueue.add("Third");

        Iterator<String> iterator = stringQueue.iterator();

        while(iterator.hasNext()) {
            System.out.println("String value : " + iterator.next());
        }
    }
}
