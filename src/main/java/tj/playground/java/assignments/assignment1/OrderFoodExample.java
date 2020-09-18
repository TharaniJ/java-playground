package tj.playground.java.assignments.assignment1;
import java.util.*;

public class OrderFoodExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to TJ!");

        System.out.println("Please tell your name and Phone No!");
        String name = sc.nextLine();
        int phoneNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Name :"+ name + "\n"+ "Phone No:" + phoneNo);

        System.out.println("Which item do you want to order?(FB or Sub)");
        String foodName = sc.nextLine();
        System.out.println(foodName);

        Map<String, String> attributeFlatBread = new HashMap<String, String>();
        attributeFlatBread.put("needCheese", "Yes");
        attributeFlatBread.put("needBacon", "Yes");
        attributeFlatBread.put("isFootLong", "No");
        attributeFlatBread.put("isGlutenFree", "Yes");

        Map<String, String> attributeSubmarine = new HashMap<String, String>();
        attributeSubmarine.put("needCheese", "Yes");
        attributeSubmarine.put("needBacon", "No");
        attributeSubmarine.put("isFootLong", "Yes");
        attributeSubmarine.put("isGlutenFree", "Yes");

        List<Map<String, String>> listOfFoodAndAttributes = new ArrayList<Map<String, String>>();
        listOfFoodAndAttributes.add(attributeFlatBread);
        listOfFoodAndAttributes.add(attributeSubmarine);

        List<Integer> finalOrder = new ArrayList<>();


        if(foodName == "FB"){

        }
    }
}

