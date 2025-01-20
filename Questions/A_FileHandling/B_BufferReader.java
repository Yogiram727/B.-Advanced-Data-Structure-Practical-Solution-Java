package Questions.A_FileHandling;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class B_BufferReader {
    public static void main(String[] args) {
        try {
            InputStreamReader i = new InputStreamReader(System.in);
            BufferedReader b = new BufferedReader(i);
            String readString;
            do {
                System.out.println("Please enter something");
                System.out.flush();
                readString = b.readLine();
                System.out.println("Hello User> This is " + "What you wrote");
                System.out.println("> " + readString);
            } while (readString.length() != 0);
        } catch (Exception e) {
        }
    }
}
