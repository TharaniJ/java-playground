package tj.playground.java.controlstructure;

public class ForLoop {
    /**
     * Looping is a common requirement in programming. Java provides many options for looping and the for loop is one
     * of them.
     *
     * In any loop the most important aspect is the stop condition. I.e. when to stop the looping. Without this, the loop
     * will continue until the program is killed.
     *
     * Apart from the stop condition, the for-loop has two unique characteristics;
     * - The loop facilitates a loop counter (a number) that the loop increments/decrements with in the loop it self
     * - Ability to define the number of iterations by the use of this loop counter
     *
     * Following are a few examples of the for-loop
     */

        public static void main(String[] args) {

            System.out.println("");
            System.out.println("First Example");
            System.out.println("--------------------");
            System.out.println("");

            // A simple for-loop
            for (int i = 0; i < 10; i++) {
                System.out.println("Value of i : " + i);
            }

            System.out.println("");
            System.out.println("Second Example");
            System.out.println("--------------------");
            System.out.println("");

            // A simple for-loop where the loop counter is decremented
            for (int i = 10; i >= 0; i--) {
                System.out.println("Value of i : " + i);
            }

            System.out.println("");
            System.out.println("Third Example");
            System.out.println("--------------------");
            System.out.println("");

            // A simple for-loop where the loop counter is incremented with multiplication
            // As shown here, the loop counter can be changed according to any formulae or function
            for (int i = 1; i <= 20; i = i * 2) {
                System.out.println("Value of i : " + i);
            }

            System.out.println("");
            System.out.println("Fourth Example");
            System.out.println("--------------------");
            System.out.println("");

            // Looping through an array
            int [] numberArray = {1, 2,3 ,4, 5, 6, 7, 8, 9, 10};

            /*
             * This is a special type or a special usage of the for-loop. This is called the "for-each" loop
             *
             * Practical implication of this is "for each integer i in numberArray", where each of the cell values
             * is assigned to the variable i which can be consumed in the loop body.
             *
             * This is an easier way (less code required) of looping through an Array or an ArrayList
             */
            for (int i : numberArray) {
                System.out.println("Number is : " + i);
            }
        }

    }

