package tj.playground.java.datastructure.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This showcases how the following operation can be done with loops (typical approach) and with set operations
 *
 * Scenario
 * 1. Two data sets available : Girls in my class AND Students from Jaffna
 * 2. Need find Girls from Jaffna
 */
public class SetOperationExample {

    public static void main(String[] args) {
        // Loop based example. The typical method of storing the data is in Array Lists
        List <String> girlsInMyClassArrayList = new ArrayList<>();
        girlsInMyClassArrayList.add("Kamala");
        girlsInMyClassArrayList.add("Fiona");
        girlsInMyClassArrayList.add("Madangi");
        girlsInMyClassArrayList.add("Chathurangi");
        girlsInMyClassArrayList.add("Anne");

        List <String> studentsFromJaffnaArrayList = new ArrayList<>();
        studentsFromJaffnaArrayList.add("Madangi");
        studentsFromJaffnaArrayList.add("Anne");
        studentsFromJaffnaArrayList.add("Geethan");

        List <String> girlsFromJaffnaArrayList = new ArrayList<>();

        for(String studentFromJaffna : studentsFromJaffnaArrayList) {
            if (girlsInMyClassArrayList.contains(studentFromJaffna)) {
                girlsFromJaffnaArrayList.add(studentFromJaffna);
            }
        }

        System.out.println("Girls from Jaffna (Loop method): " + girlsFromJaffnaArrayList);

        System.out.println("");

        // Set based method
        Set <String> girlsInMyClassSet = new HashSet<>();
        girlsInMyClassSet.add("Kamala");
        girlsInMyClassSet.add("Fiona");
        girlsInMyClassSet.add("Madangi");
        girlsInMyClassSet.add("Chathurangi");
        girlsInMyClassSet.add("Anne");

        Set <String> studentsFromJaffnaSet = new HashSet<>();
        studentsFromJaffnaSet.add("Madangi");
        studentsFromJaffnaSet.add("Anne");
        studentsFromJaffnaSet.add("Geethan");

        // Intersection
        Set <String> girlsFromJaffnaSet = new HashSet<>(girlsInMyClassSet); // Insert all girls in my class to girls
        // from Jaffna set
        girlsFromJaffnaSet.retainAll(studentsFromJaffnaSet);
        System.out.println("Girls from Jaffna (Set Method) : " + girlsFromJaffnaSet);

        // Union
        Set <String> girlsFromMyClassAndStudentsFromJaffnaSet = new HashSet<>(girlsInMyClassSet);
        girlsFromMyClassAndStudentsFromJaffnaSet.addAll(studentsFromJaffnaSet);

        System.out.println("Girls and Students (without duplicates) : " + girlsFromMyClassAndStudentsFromJaffnaSet);

    }
}
