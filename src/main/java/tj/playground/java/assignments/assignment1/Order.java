package tj.playground.java.assignments.assignment1;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<FlatBread> listOfFlatBreads;
    private List<Submarine> listOfSubmarine;

    public Order(){
        this.listOfFlatBreads = new ArrayList<>();
        this.listOfSubmarine = new ArrayList<>();
    }

    public List<FlatBread> getListOfFlatBreads() {
        return listOfFlatBreads;
    }

    public void addFlatBread(FlatBread flatBread) {
        this.listOfFlatBreads.add(flatBread);
    }

    public List<Submarine> getListOfSubmarine() {
        return listOfSubmarine;
    }

    public void addSubmarine(Submarine submarine) {
        this.listOfSubmarine.add(submarine);
    }
}
