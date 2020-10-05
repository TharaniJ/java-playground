package tj.playground.java.assignments.assignment1ReDone;


import java.util.ArrayList;
import java.util.List;

public class Orders {

    private List<FB> listOfFB;

    private List<SUB> listOfSub;

    public Orders(){
        this.listOfFB = new ArrayList<>();
        this.listOfSub = new ArrayList<>();
    }

    public List<FB> getListOfFB() {
        return listOfFB;
    }

    public void setListOfFB(FB flatbread) {
        this.listOfFB.add(flatbread);
    }

    public List<SUB> getListOfSub() {
        return listOfSub;
    }

    public void setListOfSub(SUB submarine) {
        this.listOfSub.add(submarine);
    }

}
