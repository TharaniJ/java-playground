package tj.playground.java.files.read;

import java.io.File;

public class FileReader {
    public static void main(String[] args) {
        String filePath = "data/file1.txt";
        File file = new File(filePath);

        java.io.FileReader fileReader = null;

        try {
            fileReader = new java.io.FileReader(file);

            System.out.println("Printing the ASCII value and Character\n");

            int asciiCode;
            while ((asciiCode = fileReader.read()) != -1) {    // Look at the read method javadoc
                char character = (char) asciiCode;
                System.out.println("ASCII Code : " + asciiCode + " | Character : " + character); // We are printing the ASCII value.
            }
        } catch (Exception e) {
            System.out.println("Error occurred : " + e.getMessage());
        } finally {
            try {
                fileReader.close();
            } catch (Exception e) {
                System.out.println("Error occurred closing FileReader : " + e.getMessage());
            }
        }
    }
}