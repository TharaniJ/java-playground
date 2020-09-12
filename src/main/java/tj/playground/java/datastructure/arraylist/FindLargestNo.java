package tj.playground.java.datastructure.arraylist;

import java.util.ArrayList;
import java.util.List;

public class FindLargestNo {
    public static void main(String[] args) {
        List<Integer> inputArray = new ArrayList<>();
        inputArray.add(40);
        inputArray.add(3);
        inputArray.add(56);
        inputArray.add(34);
        inputArray.add(190);
        inputArray.add(167);
        inputArray.add(1);

        int max = inputArray.get(0);
        int index = 0;
        while(index < inputArray.size()) {
            int outputArray = inputArray.get(index);
            if (outputArray > max)
                max = inputArray.get(index);
            index++;
        }

        System.out.println("Sum of numbers is : " + max);

    }
}
