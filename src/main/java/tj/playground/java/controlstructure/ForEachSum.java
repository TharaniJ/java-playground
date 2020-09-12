package tj.playground.java.controlstructure;

import java.util.Scanner;

public class ForEachSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Define Array size :");

        int arraySize = sc.nextInt();

        int [] inputArray = new int[arraySize];

        System.out.println("Enter the input values :");
        int sum = 0;
        for ( int i : inputArray) {
            int no = sc.nextInt();
            inputArray[i] = no;
            sum = sum + inputArray[i];
        }
        System.out.println("Sum of the total input value is : " + sum);
    }
}
