package tj.playground.java.hackerrank;

import java.util.Scanner;

public class StdInStdOut {
    private static Object StdIn;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String word = scan.next();

        System.out.println("String: "+word);
        System.out.println("Double: " + d );
        System.out.println("Int: " + i);
    }
}
    