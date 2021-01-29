package tj.playground.java.hackerrank;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        /*
         * Scanner reads what the user types in the commandline ('System.in').
         * It waits till the user enters something.
         */
        System.out.println(" Enter the No : ");
        Scanner scanner = new Scanner(System.in);
        // Reads the user entered value to the variable 'N'
        int N = scanner.nextInt();
        if (N % 2 != 0) {
            System.out.println("Weird");
        } else if ((2 <= N) && (N <= 5)) {
            System.out.println("Not Weird");
        } else if ((6 <= N) && (N <= 20)) {
            System.out.println("Weird");
        } else if (20 < N){
            System.out.println("Not Weird");
        }

    }
}
