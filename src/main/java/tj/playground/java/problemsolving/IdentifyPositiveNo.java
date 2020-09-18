package tj.playground.java.problemsolving;

import java.util.Scanner;

public class IdentifyPositiveNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No!");
        int no = sc.nextInt();

        if((no > 0) && (no!= 0) ){
            System.out.println("It's a Positive No !");
        }else {
            System.out.println("Its a Negative No !");
        }
    }

}
