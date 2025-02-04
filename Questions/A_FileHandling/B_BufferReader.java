package Questions.A_FileHandling;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class B_BufferReader {
    public static void main(String[] args) {
        try {
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);
            String readString;
            do {
                System.out.println("Please enter something");
                readString = br.readLine();
                if (!readString.isEmpty()) {
                    System.out.println("Hello User> This is what you wrote: ");
                    System.out.println("> " + readString);
                }
            } while (!readString.isEmpty());
        } catch (Exception e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
