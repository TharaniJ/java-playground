package tj.playground.java.datastructure.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindEvenNoUsingArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> inputArray = new ArrayList<>();

        System.out.println("Enter 5 no one by one: ");

        int inputNo = 0;
        while (inputNo < 5){
            int no = sc.nextInt();
            inputArray.add(no);
            inputNo++;
        }
        int evenNo = inputArray.indexOf(0);
        int index = 0;
        int countEven = 0;
        while(index < inputArray.size()) {
            int outputArray = inputArray.get(index);
            if (outputArray % 2 == 0) {
                countEven++;
            }
            index++;
        }
        System.out.println("Total count of the even no:"+ countEven);
    }
}
