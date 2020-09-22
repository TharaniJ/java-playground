package tj.playground.java.files.read;

import java.io.File;
import java.util.Date;

public class FileEx {

    public static void main(String[] args) {

        System.out.println("Working Directory : " + System.getProperty("user.dir"));

        String filePath = "data/file1.txt"; // Given as a relative path to working directory

        File file = new File(filePath);

        System.out.println("File exists ? " + file.exists());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("File size : " + file.length());


        Date fileLastModified = new Date(file.lastModified());
        System.out.println("Last modified at : " + fileLastModified.toString());
    }
}
