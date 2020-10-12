package tj.playground.java.assignments.assignment1;

public class FlatBread extends Sandwich {
    private String needBacon;

    public String getNeedBacon() {
        return needBacon;
    }

    public void setNeedBacon(String needBacon) {
        this.needBacon = needBacon;
    }

    public void print(){
        System.out.println("FlatBread" + "(" + "Cheese"+ "-" + getNeedCheese() + "," +
                "Bacon" + "-" + getNeedBacon() + "," +
                "Gluten-Free" + "-" + getIsGlutenFree() + ")" );

    }

}
