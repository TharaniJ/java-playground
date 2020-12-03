/*
This program written using "StringBuffer().reverse().toString()" method.
 */


package tj.playground.java.problemsolving;

import java.util.Scanner;

public class ValidatePalindromeStringV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a word ! ");

        String word1 = scanner.nextLine();

        //StringBuffer() will create modifiable String objects, reverse() will reverse the object and toString() will returns the reversed String.
        String word2 = new StringBuffer(word1).reverse().toString();

        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("it is palindrome.");
        } else {
            System.out.println("it is not a palindrome.");
        }
    }
}