package tj.playground.java.datastructure.array;
import java.util.Scanner;

public class SumUserInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //initiate scanner
        System.out.println("Enter Array Size: ");
        int no = sc.nextInt(); //read the input value for array size
        int [] inputArray = new int[no]; //assign the size of the array and define the array
        int sum = 0;

        for(int i=0; i< inputArray.length; i++){  //loop through the user input
            int inputValue = sc.nextInt(); //read the user input
            inputArray[i] = inputValue; //assign user inputs to the defined array
            sum = sum + inputArray[i]; //sum the array
        }
        System.out.println("Sum of the elements in the array :"+sum); //print sum
    }
}
