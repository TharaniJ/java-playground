package tj.playground.java.datastructure.array;

import java.util.Scanner;

public class FindEvenNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 No :");

        int [] inputArray = new int[5];

        int countEven = 0;
        int i;
        for( i = 0; i < 5; i++) {
            int inputValue = scanner.nextInt();
            if (inputValue % 2 == 0) {
                inputArray[i] = inputValue;
                countEven++; //increment the count
            }
        }
        System.out.println("Total count of the even no:"+ countEven);
        for (i = 0; i < inputArray.length; i++){
            if(inputArray[i] != 0) {
                System.out.println(inputArray[i] + " ");
            }
        }
    }
}
