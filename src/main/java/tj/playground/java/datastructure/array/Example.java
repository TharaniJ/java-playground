package tj.playground.java.datastructure.array;

public class Example {
    public static void main(String[] args) {

        // One way of defining an array. The array should have a data type and the data
        // Here, we give the size of the array explicitly
        int [] numberArray = new int[10];

        numberArray[0] = 5;
        numberArray[1] = 6;
        numberArray[2] = 2;
        numberArray[3] = 8;
        numberArray[4] = 9;
        numberArray[5] = 1;
        numberArray[6] = 22;
        numberArray[7] = 82;
        numberArray[8] = 12;
        numberArray[9] = 56;

        // This is another way of defining the array.
        // Based on the number of inputs, the size of the array is determined
        int [] secondNumberArray = {2, 33, 42, 22, 56, 31, 12, 11, 10, 17, 32};

        System.out.println("Index 5 of numberArray is : " + numberArray[5]);

        System.out.println("Index 4 of secondNumberArray is : " + secondNumberArray[4]);

        System.out.println("");

        // printing array values in a for loop


        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Index " + i + " of numberArray is : " + numberArray[i]);
        }

        System.out.println("");

        // Prints in the reverse order
        for (int i = (secondNumberArray.length - 1); i >= 0 ; i--) {
            System.out.println("Index " + (i) + " of secondNumberArray is : " + secondNumberArray[i]);
        }

        System.out.println("");

        // Prints in the correct order without changing the loop configuration

        /*
         * To solve this problem, the indexes we should provide to secondNumber array should start from 0 and go to 10
         * To do this, we need to adjust the value of i, with the help of another variable 'counter'
         *
         * For the first index, we can do the following;
         * counter = 10;
         * secondNumberArray[i - counter]
         *
         * But for the subsequent indices, we need to adjust the counter. Let's see how counter should change.
         *
         * Following is the data table assuming; index-needed = value-of-i - value-of-counter
         *
         * | value-of-i | index-needed  | value-of-counter
         * -----------------------------------------------
         * | 10         | 0             | 10
         * | 9          | 1             | 8
         * | 8          | 2             | 6
         * | 7          | 3             | 4
         * | 6          | 4             | 2
         * | 5          | 5             | 0
         * | 4          | 6             | -2
         * | 3          | 7             | -4
         * | 2          | 8             | -6
         * | 1          | 9             | -8
         * | 0          | 10            | -10
         *
         * When we look at the above pattern, following is very clear;
         * 1. The variable 'counter' should have the starting value at 10
         * 2. In every iteration, the 'counter' should be reduced by 2
         *
         * Based on the above explanation, the following implementation is done
         */
        int counter = 10;
        for (int i = (secondNumberArray.length - 1); i >= 0 ; i--) {
            System.out.println("Index " + (i - counter) + " of secondNumberArray is : " + secondNumberArray[i - counter]);
            counter = counter - 2;
        }
    }
}
