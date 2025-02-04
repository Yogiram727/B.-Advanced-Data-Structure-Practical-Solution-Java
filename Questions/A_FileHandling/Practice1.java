package Questions.A_FileHandling;

import java.io.FileWriter;

public class Practice1 {
    public static void main(String[] args) {
        try {
            FileWriter wr = new FileWriter("c:\\Users\\Dell\\Downloads\\hello.txt");
            wr.write("hello");
            System.out.println("Written Successfully");
            wr.close();

        } catch (Exception e) {
            System.out.println("An exception has occured");
            e.printStackTrace();
        }

    }
}
