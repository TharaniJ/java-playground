package tj.playground.java.controlstructure;

import java.util.Scanner;

public class ForLoopPrintSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 No :");
        int sum = 0;

        for(int i=1; i<=5; i++){
            int inputValue = scanner.nextInt();
            sum = sum + inputValue;
        }
        System.out.println("Sum of the elements in the array :"+sum); //print sum
    }

}
