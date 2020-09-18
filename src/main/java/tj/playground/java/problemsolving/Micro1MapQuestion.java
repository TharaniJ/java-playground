package tj.playground.java.problemsolving;

import java.util.HashMap;
import java.util.Map;

public class Micro1MapQuestion {

    public static void main(String[] args) {

        Map<String, String> grades = new HashMap<>(); // Instantiate the variable with a Hashmap

        //Enter values with specific keys.
        grades.put("A+", "85");
        grades.put("A", "80");
        grades.put("A-", "75");
        grades.put("B+", "70");
        grades.put("B", "65");
        grades.put("B-", "60");

        //Looping through the key set of the 'grade' table.
        for (String key : grades.keySet()) {
            //Get the value mapped by the key and assign to value.
            String value = grades.get(key);
            //Print the key and value.
            System.out.println(key + " " + value);
        }

    }

}
