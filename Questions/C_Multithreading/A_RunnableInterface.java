// File Name: A_RunnableInterface.java
package Questions.C_Multithreading;

public class A_RunnableInterface {
    public static void main(String[] args) {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread t1 = new Thread(new M());
            t1.start();

        }
    }
}

// Runnable implementation class
class M implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
