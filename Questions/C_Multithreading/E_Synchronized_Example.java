package Questions.C_Multithreading;

class Counter {
    private int count = 0;

    // Synchronized method to ensure thread-safe increment
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class E_Synchronized_Example {
    public static void main(String[] args) {

        Counter counter = new Counter();

        // Create two threads that increment the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++)
                counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++)
                counter.increment();
        });

        t1.start();
        t2.start();

        try {
            t1.join(); // Wait for t1 to finish
            t2.join(); // Wait for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final Count: " + counter.getCount()); // Expected output: 10
    }
}