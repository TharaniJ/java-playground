package tj.playground.java.datastructure.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> numberSet = new HashSet<>();

        numberSet.add(1);
        numberSet.add(2);
        numberSet.add(3);
        numberSet.add(8);
        numberSet.add(4);
        numberSet.add(5);
        numberSet.add(6);
        numberSet.add(7);
        numberSet.add(4);
        numberSet.add(8);

        Iterator<Integer> numberSetIterator = numberSet.iterator();

        while(numberSetIterator.hasNext()) {
            System.out.println(numberSetIterator.next());
        }

    }
}
