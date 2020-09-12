package tj.playground.java.datastructure.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {

        Map<String, String> testData;  // Define the variable
        testData = new HashMap<>(); // Instantiate the variable with a Hashmap

        //Map<String, String> testData1 = new HashMap<>();

        // Enter values with specific keys
        testData.put("userName", "teacher");
        testData.put("password", "moodle");
        testData.put("moodleProfile", "abc");

        // Retrieve the values by key
        String userName = testData.get("userName");
        System.out.println("User Name : " + userName);

        System.out.println("Password : " + testData.get("password"));


        System.out.println("Does the key 'userName' exist? " + testData.containsKey("userName"));
        System.out.println("Does the key 'abc' exist? " + testData.containsKey("abc"));

        System.out.println("Does the value 'moodle' exist? " + testData.containsValue("moodle"));
        System.out.println("Does the value 'abc' exist? " + testData.containsValue("abc"));

        // Removing username
        testData.remove("userName");
        System.out.println("Removed userName key and value");
        System.out.println("Does the key 'userName' exist? " + testData.containsKey("userName"));

        Set<String> keySet = testData.keySet();
        System.out.println("Current Key Set is : " + keySet);
    }
}
