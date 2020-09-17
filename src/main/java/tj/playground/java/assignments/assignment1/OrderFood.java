package tj.playground.java.assignments.assignment1;
import java.util.Scanner;

public class OrderFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to TJ!");
        System.out.println("Please tell your Name!");

        Customer customer = new Customer();
        customer.setCustomerName(sc.nextLine());

        System.out.println("Please tell your Phone Number");
        customer.setPhoneNumber(sc.nextInt());
        sc.nextLine();
     //   System.out.println(customer.getCustomerName());
     //   System.out.println(customer.getPhoneNumber());
        Order order = new Order();

        String addSandwich = "Y";

        while(addSandwich.equalsIgnoreCase("Y")) {

            System.out.println("Which item do you want to order?(Select FB for flat bread and SUB for submarine)");
            String selectedItem = sc.nextLine();

            if (selectedItem.equalsIgnoreCase("FB")) {
                FlatBread flatBread = new FlatBread();
                System.out.println("Do you want Bacon? (Y/N)");
                flatBread.setNeedBacon(sc.nextLine());
                System.out.println("Do you want Cheese? (Y/N)");
                flatBread.setNeedCheese(sc.nextLine());
                System.out.println("Do you want GlutenFree? (Y/N)");
                flatBread.setIsGlutenFree(sc.nextLine());

                order.addFlatBread(flatBread);


            } else if (selectedItem.equalsIgnoreCase("SUB")) {
                Submarine submarine = new Submarine();
                System.out.println("Do you want FootLong? (Y/N)");
                submarine.setIsFootLong(sc.nextLine());
                System.out.println("Do you want Cheese");
                submarine.setNeedCheese(sc.nextLine());
                System.out.println("Do you want glutenFree? (Y/N)");
                submarine.setIsGlutenFree(sc.nextLine());

                order.addSubmarine(submarine);
            }

            System.out.println("Do you want to add sandwich? (Y/N)");
            addSandwich = sc.nextLine();
        }
        customer.setOrder(order);

        System.out.println("No more sandwich required ");

        System.out.println("This is your Order : ");

        OrderPrinter orderPrinter = new OrderPrinter();
        orderPrinter.printOrder(customer);

    }
}
