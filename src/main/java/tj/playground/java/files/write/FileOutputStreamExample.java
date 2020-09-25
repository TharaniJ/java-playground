package tj.playground.java.files.write;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        //Assign the file path to the filePath variable
        String filePath = "data/new-file.txt";
        //Instantiate the file using filePath
        File file = new File(filePath);
        //Define fileOutputStream to null
        FileOutputStream fileOutputStream = null;

        try {
            //Initiate fileOutputStream using file and append given as false.
            fileOutputStream = new FileOutputStream(file, false);

            //define a byte array to get the ASCII value of the character
            byte [] byteArray = {72, 'e','l','l','o'};

            //write the byteArray to the fileOutputStream
            fileOutputStream.write(byteArray);

            System.out.println("Written 'Hello' to file : " + filePath);

            //get all the data from the fileOutputStream
            fileOutputStream.flush();

        } catch (Exception e) {
            System.out.println("Error occurred : " + e.getMessage());
        } finally {
            try {
                fileOutputStream.close();
            } catch (Exception e) {
                System.out.println("Error occurred : " + e.getMessage());
            }
        }
    }
}
