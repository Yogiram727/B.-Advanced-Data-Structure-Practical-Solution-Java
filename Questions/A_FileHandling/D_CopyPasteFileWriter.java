package Questions.A_FileHandling;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class D_CopyPasteFileWriter {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("c:\\Users\\Dell\\Downloads\\input.txt");
            out = new FileWriter("c:\\Users\\Dell\\Downloads\\output.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}