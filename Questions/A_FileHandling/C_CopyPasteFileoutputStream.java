package Questions.A_FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C_CopyPasteFileoutputStream {
    public static void main(String[] args) {
        try (
                FileInputStream in = new FileInputStream("c:\\Users\\Dell\\Downloads\\input.txt");
                FileOutputStream out = new FileOutputStream("c:\\Users\\Dell\\Downloads\\output.txt")) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred during file operations.");
            e.printStackTrace();
        }
    }
}
