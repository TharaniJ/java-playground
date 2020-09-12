package tj.playground.java.datastructure.array;
import java.util.Scanner;

public class ReadUserInputStoreInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 No :");
        int [] arr = new int[5];

        for(int i=0; i<5; i++){
            int no = scanner.nextInt();
            arr[i] = no;
        }

        for(int j=0; j<arr.length; j++){
            int outputArr = arr[j];
            System.out.println(outputArr);
        }
    }
}