package tj.playground.java.datastructure.array;

import java.util.Scanner;

public class FindEvenNoUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int no = sc.nextInt(); //read the input value for array size
        int [] inputArray = new int[no]; //assign the size of the array and define the array
        int countEven = 0;

        for(int i=0; i< inputArray.length; i++) {  //loop through the user input
            int inputValue = sc.nextInt(); //read the user input
            inputArray[i] = inputValue; //assign user inputs to the defined array
            if (inputArray[i] % 2 == 0) {
                countEven++; //increment the count
            }
        }
        System.out.println("Total count of the even no:"+ countEven); //print the total count of the even no in the array

    }
}
