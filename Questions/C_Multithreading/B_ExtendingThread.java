package Questions.C_Multithreading;

import java.lang.Thread;
import java.io.IOException;

public class B_ExtendingThread {
    public static void main(String[] args) {
        G t1 = new G();
        t1.start();
    }
}

class G extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (Exception e) {
        }
    }
}
