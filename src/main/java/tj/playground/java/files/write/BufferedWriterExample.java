package tj.playground.java.files.write;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWriterExample {
    public static void main(String[] args) {
        String filePath = "data/new-file.txt";
        File file = new File(filePath);

        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, false));

            bufferedWriter.write("This is a line.");
            bufferedWriter.append(" Now this section will be appended");
            bufferedWriter.newLine();
            bufferedWriter.write("This is a second line");

            System.out.println("Done writing. Now flushing all the characters to the file");
            bufferedWriter.flush();
        } catch (Exception e) {
            System.out.println("Error occurred : " + e.getMessage());
        } finally {
            try {
                bufferedWriter.close();
            } catch (Exception e) {
                System.out.println("Error occurred : " + e.getMessage());
            }
        }
    }
}
