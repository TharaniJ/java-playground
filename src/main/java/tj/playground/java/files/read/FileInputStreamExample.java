package tj.playground.java.files.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        String filePath = "data/file1.txt";

        File file = new File(filePath);

        FileInputStream fileInputStream = null; // Define the FileInputStream variable


        /*
         * Working with files can cause many exceptions since the program is dealing with the Operating System
         * to access files. Therefore, we MUST use exception handling via try-catch.
         */
        try {
            fileInputStream = new FileInputStream(file);    // Initialize the FileInputStream

            System.out.println("Printing the ASCII value and Character\n");

            int asciiCode;
            while ((asciiCode = fileInputStream.read()) != -1) {    // Look at the read method javadoc
                char character = (char) asciiCode;  // casted to char - Cast >> Changing the type of a variable to a compatible type.
                System.out.println("ASCII Code : " + asciiCode + " | Character : " + character); // We are printing the ASCII value.
            }
        } catch (FileNotFoundException e) {
            // If the provided filepath is incorrect, then this Exception is thrown
            System.out.println("Invalid file path: " + e.getMessage());
        } catch (IOException e) {
            // If there are any other issue with reading the file, this error is thrown.
            System.out.println("Input output error: " + e.getMessage());
        } catch (Exception e) {
            // General catch block (since Exception is the Super Class)
            System.out.println("Error occurred : " + e.getMessage());
        } finally {
            try {
                // We must close the stream after use. However, it can throw errors as well.
                fileInputStream.close();
            } catch (Exception e) {
                System.out.println("Error occurred in closing the file: " + e.getMessage());
            }
        }


        // Following is the same as the above example. But reads the characters in one-go
        try {
            /*
             * We have to re-initialize the stream. This is coz the earlier stream read all the data from the file
             * and decided that there's nothing to read. Then we closed the stream.
             */
            fileInputStream = new FileInputStream(file);

            System.out.println("\nReading the entire bytes in to an array\n");
            byte [] fileBytes = new byte[(int)file.length()];

            fileInputStream.read(fileBytes);

            for (byte asciiCode : fileBytes) {
                char character = (char)asciiCode;
                System.out.println("ASCII Code : " + asciiCode + " | Character : " + character);
            }

            System.out.println(fileBytes);
        } catch (Exception e) {
            // Here, instead of capturing each and every exception, we've caught the global exception
            System.out.println("Error occurred : " + e.getMessage());
        }finally {
            try {
                fileInputStream.close();
            } catch (Exception e) {
                System.out.println("Error occurred in closing the file : " + e.getMessage());
            }
        }
    }
}
