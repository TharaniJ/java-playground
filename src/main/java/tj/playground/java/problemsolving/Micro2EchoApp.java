/*
Write an echo app. Following is what it does?
 - Prompt the user to enter something in the command line
 - Read what the user entered
 - If the user entered “exit” then quit the program
 - print what the user entered in the command line (unless the program was exited in 2.a)
 */
package tj.playground.java.problemsolving;
import java.util.Scanner;

public class Micro2EchoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String enterWord;
        do{
            System.out.println("Please type something ...");
            enterWord = sc.nextLine();
            System.out.println(enterWord);
        }while (!"exit".equalsIgnoreCase(enterWord));

    }
}
