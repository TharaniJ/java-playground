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
            submarine.print();
        }

        for (FlatBread flatBread : listOfFlatBread){
            flatBread.print();
        }
    }

}
