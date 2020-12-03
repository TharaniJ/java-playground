package tj.playground.java.problemsolving;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidatePalindromeStringV2 {
    public static void main(String[] args) {
        String straightWord, reverseWord = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word:");

        ArrayList<Character> sample = new ArrayList<Character>();

        straightWord = sc.nextLine();

        for (int i = straightWord.length() - 1; i >= 0; i--)
            reverseWord = reverseWord + straightWord.charAt(i);

            if (straightWord.equals(reverseWord))
                System.out.println(" is a palindrome");
            else
                System.out.println(" is not a palindrome");

    }
}
