package tj.playground.java.datastructure.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * An ArrayList is a common data structure used in programming. It has the following characteristics;
 * - A sequence of data containers/cells
 * - With no pre-defined size. We can add data elements dynamically
 * - Can hold only one type of data
 * - Data in cells are accessed by cell index which starts at 0
 *
 * Unlike the Array, ArrayList is a class defined in the Collections framework in Java. Therefore, to define an ArrayList
 * we need to create a new object of the ArrayList.
 *
 * ArrayList has built-in methods to insert values (add) and read values (get).
 *
 * Following is an example of how ArrayLists are used and how for-loop can be used to access ArrayList elements
 */
public class Example {

    public static void main(String[] args) {

        /*
         * Following is the best practice of defining an ArrayList. This is a little different to any other variable
         * definition, where we give the type of the variable as the same as the type of the object we create.
         *
         * The reason for using List as the type of the variable is due to a best practice that we follow in Java.
         * List is an interface in Java.
         *
         * An interface is a special type in Java which only includes the method signatures. Interfaces DO NOT provide
         * method implementations (i.e. method bodies). Other classes 'implement' an interface, which means provide
         * implementations for all the defined methods.
         *
         * List is an interface in Java. ArrayList is a class that implements the List interface. In such scenarios,
         * we define the variable type as the Interface type and create the object from the class that implements the
         * interface. This is an example of Abstraction - where we hide the complexities in the class that actually
         * implements the method.
         *
         * Also, since List and ArrayList belong to the Collection package, how we include the data type is in angular
         * brackets. At the same time, the type we specify MUST be an object (int, long, double etc. not allowed.
         * Instead, Integer, Double, Long are used.
         */
        List<Integer> numberArrayList = new ArrayList<>();

        numberArrayList.add(4);
        numberArrayList.add(7);
        numberArrayList.add(12);
        numberArrayList.add(7);
        numberArrayList.add(3);
        numberArrayList.add(8);
        numberArrayList.add(2);

        numberArrayList.add(4, 44);

        System.out.println("Index 5 of numberArrayList is : " + numberArrayList.get(5));
        System.out.println("Index of value 3 is : " + numberArrayList.indexOf(3));
        System.out.println("Does this have value 2 : " + numberArrayList.contains(2));
        System.out.println("Does this have value 555 : " + numberArrayList.contains(555));

        System.out.println("");

        // Printing arraylist values in a for-loop

        for (int i = 0; i < numberArrayList.size(); i++) {
            System.out.println("Index " + i + " of numberArrayList is : " + numberArrayList.get(i));
        }

        System.out.println("");

        // Print arraylist values in a for-each loop

        // How to read this >> 'For each number (which is an Integer) in numberArrayList'
        for (Integer number : numberArrayList) {
            System.out.println("Value : " + number);
        }
    }
}
