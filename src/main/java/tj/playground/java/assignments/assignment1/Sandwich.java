package tj.playground.java.assignments.assignment1;

public abstract class Sandwich {

    private String needCheese;

    private String isGlutenFree;

    public String getNeedCheese() {
        return needCheese;
    }

    public void setNeedCheese(String needCheese) {
        this.needCheese = needCheese;
    }

    public String getIsGlutenFree() {
        return isGlutenFree;
    }

    public void setIsGlutenFree(String isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
    }

    public abstract void print();


}
