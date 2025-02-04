package Questions.A_FileHandling;

import java.io.FileReader;

public class Practice2 {

    public static void main(String[] args) {
        int ch;
        try {
            FileReader fr = new FileReader("c:\\Users\\Dell\\Downloads\\hello.txt");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("An Error has occured");
            e.printStackTrace();
        }
    }
}
