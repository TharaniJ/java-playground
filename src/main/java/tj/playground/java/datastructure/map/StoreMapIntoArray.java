package tj.playground.java.datastructure.map;

import java.util.*;

public class StoreMapIntoArray {
    public static void main(String[] args) {
        // HashMap 1: input preparation for WEST India Region
        Map<String, String> westIndiaStateCapital =
                new HashMap<String, String>();
        westIndiaStateCapital.put("Maharashtra", "Mumbai");
        westIndiaStateCapital.put("Gujarat", "Gandhinagar");
        westIndiaStateCapital.put("Rajasthan", "Jaipur");
        westIndiaStateCapital.put("Goa", "Panaji");

        // HashMap 2: input preparation for SOUTH India Region
        Map<String, String> southIndiaStateCapital =
                new HashMap<String, String>();
        southIndiaStateCapital.put("Andhra Pradesh", "Amaravati");
        southIndiaStateCapital.put("Karnataka", "Bengaluru");
        southIndiaStateCapital.put("Kerala","Thiruvananthapuram");
        southIndiaStateCapital.put("Tamil Nadu", "Chennai");
        southIndiaStateCapital.put("Telangana", "Hyderabad");

        // HashMap 3: input preparation for EAST India Region
        Map<String, String> eastIndiaStateCapital =
                new HashMap<String, String>();
        eastIndiaStateCapital.put("Bihar", "Patna");
        eastIndiaStateCapital.put("Jharkhand", "Ranchi");
        eastIndiaStateCapital.put("West Bengal", "Kolkata");
        eastIndiaStateCapital.put("Odisha", "Bhubaneswar");

        // HashMap 4: input preparation for SOUTH India Region
        Map<String, String> northIndiaStateCapital =
                new HashMap<String, String>();
        northIndiaStateCapital.put("Delhi", "New Delhi");
        northIndiaStateCapital.put("Himachal Pradesh", "Shimla");
        northIndiaStateCapital.put("Jammu n Kashmir", "Srinagar");
        northIndiaStateCapital.put("Punjab", "Chandigarh");

        // HashMap 5: input preparation for CENTRAL India Region
        Map<String, String> centralIndiaStateCapital =
                new HashMap<String, String>();
        centralIndiaStateCapital.put("Madhya Pradesh", "Bhopal");
        centralIndiaStateCapital.put("Uttar Pradesh", "Lucknow");
        centralIndiaStateCapital.put("Chhattisgarh", "Raipur");


        // create ArrayList and insert all 5 HashMap into it
        List<Map<String, String>> listOfIndianRegions =
                new ArrayList<Map<String, String>>();

        // add all 5 regions to AL
        listOfIndianRegions.add(westIndiaStateCapital);
        listOfIndianRegions.add(southIndiaStateCapital);
        listOfIndianRegions.add(eastIndiaStateCapital);
        listOfIndianRegions.add(northIndiaStateCapital);
        listOfIndianRegions.add(centralIndiaStateCapital);

        // temp variable to indicate zone/region
        int regionIndex = 1;

        // Way 2: Iterate using Iterator interface and
        // loop through Map using keyset() method
        System.out.println("Way 2: Iterate using"
                + " Iterator interface and "
                + "loop through Map using keyset() method");
        for(Map<String, String> region : listOfIndianRegions) {

            System.out.println("\nIndia Region - " + regionIndex);
            System.out.println("============================"
                    + "======================");

            // get entrySet() into Set
            Set<String> setOfIndianStates = region.keySet();

            // Collection Iterator
            Iterator<String> iterator =
                    setOfIndianStates.iterator();

            // iterate using while-loop after getting Iterator
            while(iterator.hasNext()) {

                String key = iterator.next();
                System.out.println("State : " + key
                        + "\tCapital : " + region.get(key));
            }

            // increment region index by 1
            regionIndex++;
        }
    }
}
