package tj.playground.java.files.read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferFileReaderExample {
    public static void main(String[] args) {
        String filePath = "data/configuration.properties";
        File file = new File(filePath);

        BufferedReader bufferedReader;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Line : " + line);
            }
        } catch (Exception e) {
            System.out.println("Error occurred : " + e.getMessage());
        }
    }
}
