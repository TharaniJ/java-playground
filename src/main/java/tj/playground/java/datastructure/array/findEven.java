package tj.playground.java.datastructure.array;

import java.util.Scanner;

public class findEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the Array");

        int arraySize = scanner.nextInt();

        int [] array = new int[arraySize];

        int countEven = 0;

        for (int i=0 ; i < array.length ; i++ ){
            int nos = scanner.nextInt();
            array[i] = nos;
            if(array[i] % 2 == 0){
                countEven++;
            }
        }
        System.out.println("Total count of the even no:"+ countEven);
    }
}
