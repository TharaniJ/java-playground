package tj.playground.java.controlstructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class whileLoopSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumberArrayList = new ArrayList<>();

        boolean isThereMoreInputs = true;


        while(isThereMoreInputs) {
            System.out.println("Enter a number : (Enter -1 if you want to stop gathering inputs)");
            int inputNumber = scanner.nextInt();

            if (inputNumber < 0) {
                isThereMoreInputs = false;
                System.out.println("End of input sequence detected");
            } else {
                inputNumberArrayList.add(inputNumber);
                System.out.println("Added number " + inputNumber);
            }
        }

        System.out.println("Input gathering terminated");

        int sum = 0;

        int index = 0;
        while(index < inputNumberArrayList.size()) {
            sum = sum + inputNumberArrayList.get(index);
            index++;
        }

        System.out.println("Sum of numbers is : " + sum);
    }
}
