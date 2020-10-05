package tj.playground.java.assignments.assignment1ReDone;
import java.util.List;

public class PrintOrder {
    public void printOrder(Customer customer){
        System.out.println("Customer : " + customer.getCustomerName());
        System.out.println("Phone : " + customer.getPhoneNumber());
        System.out.println(" ");

        Orders orders = customer.getOrder();

        List<FB> listOfFlatBread = orders.getListOfFB();
        List<SUB> listOfSubmarine = orders.getListOfSub();

        for (SUB submarine : listOfSubmarine ){
            System.out.println("FlatBread" + "(" + "Cheese"+ "-" + submarine.getNeedCheese() + "," +
                    "FootLong" + "-" + submarine.getIsFoodLong()+ "," +
                    "Gluten-Free" + "-" + submarine.getIsGlutenFree() + ")" );
        }

        for (FB flatBread : listOfFlatBread){
            System.out.println("FlatBread" + "(" + "Cheese"+ "-" + flatBread.getNeedCheese() + "," +
                    "Bacon" + "-" + flatBread.getNeedBacon() + "," +
                    "Gluten-Free" + "-" + flatBread.getIsGlutenFree() + ")" );

        }
    }

}

