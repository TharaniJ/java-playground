package tj.playground.java.assignments.assignment1ReDone;

import java.util.Scanner;

public class OrderFoods {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to TJ Rest!");
        System.out.println("Enter your Name.");

        Customer customer  = new Customer();
        customer.setCustomerName(sc.nextLine());

        System.out.println("Enter your Mobile No.");
        customer.setPhoneNumber(sc.nextLine());

        Orders orders = new Orders();

        String addSandwich = "Y";

        while(addSandwich.equalsIgnoreCase("Y")) {

            System.out.println("Which item do you want to order?(FB/SAB)");
            String selectTheItem = sc.nextLine();
            if (selectTheItem.equalsIgnoreCase("FB")) {
                FB flatBread = new FB();
                System.out.println("Do you want Bacon? (Y/N)");
                flatBread.setNeedBacon(sc.nextLine());
                System.out.println("Do you want Cheese? (Y/N)");
                flatBread.setNeedCheese(sc.nextLine());
                System.out.println("Do you want GlutenFree? (Y/N)");
                flatBread.setIsGlutenFree(sc.nextLine());

                orders.setListOfFB(flatBread);


            } else if (selectTheItem.equalsIgnoreCase("SUB")) {
                SUB submarine = new SUB();
                System.out.println("Do you want FootLong? (Y/N)");
                submarine.setIsFoodLong(sc.nextLine());
                System.out.println("Do you want Cheese");
                submarine.setNeedCheese(sc.nextLine());
                System.out.println("Do you want glutenFree? (Y/N)");
                submarine.setIsGlutenFree(sc.nextLine());

                orders.setListOfSub(submarine);
            }
            System.out.println("Do you want to add sandwich? (Y/N)");
            addSandwich = sc.nextLine();

        }
        customer.setOrder(orders);

        System.out.println("No more sandwich required ");
        System.out.println(" ");
        System.out.println("This is your Order : ");

        PrintOrder printOrder = new PrintOrder();
        printOrder.printOrder(customer);

    }
}
