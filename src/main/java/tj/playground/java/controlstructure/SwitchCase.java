package tj.playground.java.controlstructure;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        //Initiating scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        //Read the input from command line
        int day = in.nextInt();

        // Get the name for the Week

        //Define a variable to store the day
      String dayName;

        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
        }
        System.out.println(dayName);
    }
}
