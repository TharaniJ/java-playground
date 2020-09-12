package tj.playground.java.datastructure.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumUserInputInArrayList {
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
        int sum = 0;

        int index = 0;
        while(index < inputArray.size()) {
            sum = sum + inputArray.get(index);
            index++;
        }

        System.out.println("Sum of numbers is : " + sum);

    }
}
