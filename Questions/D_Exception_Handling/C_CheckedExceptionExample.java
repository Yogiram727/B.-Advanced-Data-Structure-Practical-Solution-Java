package Questions.D_Exception_Handling;

import java.io.*;

public class C_CheckedExceptionExample {
    public static void main(String[] args) {
        try {

            FileReader file = new FileReader("nonexistentfile.txt");
            BufferedReader fileInput = new BufferedReader(file);
            System.out.println(fileInput.readLine());

        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}