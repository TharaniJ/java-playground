package tj.playground.java.problemsolving;

import java.io.File;

public class GetAllFileName {
    public static void main(String[] args) {
        String filePath = "C://";

        File file = new File(filePath);

        String[] listOfFiles = file.list();

        for(String name:listOfFiles){

            System.out.println(name);
        }
    }
}
