package tj.playground.java.assignments.assignment1;

import java.util.List;

public class OrderPrinter {

    public void printOrder(Customer customer){
        System.out.println("Customer : " + customer.getCustomerName());
        System.out.println("Phone : " + customer.getPhoneNumber());
        System.out.println(" ");

        Order order = customer.getOrder();

        List<Submarine> listOfSubmarine = order.getListOfSubmarine();
        List<FlatBread> listOfFlatBread = order.getListOfFlatBreads();

        for (Submarine submarine : listOfSubmarine ){
            System.out.println("FlatBread" + "(" + "Cheese"+ "-" + submarine.getNeedCheese() + "," +
                    "FootLong" + "-" + submarine.getIsFootLong() + "," +
                    "Gluten-Free" + "-" + submarine.getIsGlutenFree() + ")" );
        }

        for (FlatBread flatBread : listOfFlatBread){
            System.out.println("FlatBread" + "(" + "Cheese"+ "-" + flatBread.getNeedCheese() + "," +
                    "Bacon" + "-" + flatBread.getNeedBacon() + "," +
                    "Gluten-Free" + "-" + flatBread.getIsGlutenFree() + ")" );

        }
    }

}
