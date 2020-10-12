package tj.playground.java.assignments.assignment1;

public class Submarine extends Sandwich {
    private String isFootLong;

    public String getIsFootLong() {
        return isFootLong;
    }

    public void setIsFootLong(String isFootLong) {
        this.isFootLong = isFootLong;
    }

    public void print(){
        System.out.println("FlatBread" + "(" + "Cheese"+ "-" + getNeedCheese() + "," +
                "FootLong" + "-" + getIsFootLong() + "," +
                "Gluten-Free" + "-" + getIsGlutenFree() + ")" );
    }
}
