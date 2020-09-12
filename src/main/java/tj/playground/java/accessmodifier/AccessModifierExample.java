package tj.playground.java.accessmodifier;

import java.util.concurrent.Callable;

public class AccessModifierExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int output1 = calculator.add(3, 4);
        int output2 = calculator.divide(3,3);
        int output3 = calculator.multiply(3,3);;


        System.out.println("Output1 : " + output1);
        System.out.println("Output2 : " + output2);
        System.out.println("Output3 : " + output3);

        calculator.showAvailableMethods();
    }
}
