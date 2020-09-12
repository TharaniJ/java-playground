package tj.playground.java.controlstructure;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in) ;
        String inputValue = scanner.nextLine();

        if (inputValue == null){
            System.out.println("successfully exit the program");
            return;
        }

        if(inputValue.equalsIgnoreCase("chrome")){
            System.out.println("its a chrome browser");
        }else {
            System.out.println("its another browser");
        }


        if(inputValue.equalsIgnoreCase("edge")){
            System.out.println("its a IE browser");
        }else if (inputValue.equalsIgnoreCase("mozilla")){
            System.out.println("its a firefox browser");
        }else{
            System.out.println("another browser");
        }
    }
}
