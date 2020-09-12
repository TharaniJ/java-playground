package tj.playground.java.datastructure.array;

import java.util.Scanner;

public class ReadUserInputFindBiggerNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers one by one");
        int [] inputArray = new int[5];

        for(int i=0; i<5; i++){
            int no = scanner.nextInt();
            inputArray[i] = no;
        }
        int max = inputArray[0];
        for(int j=0; j<inputArray.length; j++){
            int outputArr = inputArray[j];
            if (outputArr > max)
                max = inputArray[j];
        }
        System.out.println("Big no is: " + max);
    }
}
