package tj.playground.java.accessmodifier;

public class Calculator {

    public int add(int no1,int no2)
    {
        return no1+no2;
    }

    private int substract(int no1, int no2)
    {
        return no1+no2;
    }

    protected int divide(int no1, int no2)
    {
        return no1/no2;
    }

    int multiply(int no1, int no2)
    {
        return no1*no2;
    }

    public void showAvailableMethods(){
        System.out.println("Subtract two numbers");
        System.out.println("Add two numbers");
        System.out.println("Multiply two numbers");
        System.out.println("Divide two numbers");
    }

}
