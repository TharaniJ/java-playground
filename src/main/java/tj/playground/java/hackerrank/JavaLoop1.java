package tj.playground.java.hackerrank;

import java.sql.SQLOutput;
import java.util.Scanner;

public class JavaLoop1 {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int n=1; n<=10; n++){
            int Result = N * n;
            System.out.println(N+"\t"+"x"+"\t"+n+"\t"+"="+"\t"+Result);
        }

    }
}
