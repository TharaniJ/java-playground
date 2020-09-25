package tj.playground.java.files.write;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String[] args) {

        String filePath = "data/new-file.txt";

        File file = new File(filePath);

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file, false);

            fileWriter.write("Hello This is a String");

            System.out.println("Written 'Hello This is a String' to file : " + filePath);

            fileWriter.write("\nAnother line");

            fileWriter.flush();

        } catch (Exception e) {

            System.out.println("Error occurred : " + e.getMessage());

        } finally {

            try {

                fileWriter.close();

            } catch (Exception e) {

                System.out.println("Error occurred : " + e.getMessage());

            }
        }
    }
}
