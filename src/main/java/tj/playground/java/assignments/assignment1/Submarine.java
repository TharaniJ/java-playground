package tj.playground.java.assignments.assignment1;

import tj.playground.java.assignments.assignment1.Sandwich;

public class Submarine extends Sandwich {
    private String isFootLong;

    public String getIsFootLong() {
        return isFootLong;
    }

    public void setIsFootLong(String isFootLong) {
        this.isFootLong = isFootLong;
    }

    public void print(){
        System.out.println("just print something");
    }
}