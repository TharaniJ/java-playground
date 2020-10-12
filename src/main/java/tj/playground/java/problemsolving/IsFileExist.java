package tj.playground.java.problemsolving;

import java.io.File;

public class IsFileExist {

    public static void main(String[] args) {

        String filePath = "C:/EDU/Intellij/HelloWorld.iml";

        File helloWorldFile = new File(filePath);

        if (helloWorldFile.exists())
        {
            System.out.println("The file exists.\n");
        }
        else
        {
            System.out.println("The file not exist.\n");
        }
    }
}
