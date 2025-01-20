package Questions;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class J_FileWriter {
    public static void main(String[] args) {
        try {
            FileWriter wr = new FileWriter("c:\\Users\\Dell\\Downloads\\.output.txt");
            wr.write("Hello");
            wr.close();
            System.out.println("Successfully Written");
        } catch (IOException e) {
            System.out.println("An Error has occured");
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader("c:\\Users\\Dell\\Downloads\\.output.txt");
            int ch;
            System.out.println("Reading from the file");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("An error has occured while reading the file");
            e.printStackTrace();
        }
    }
}
