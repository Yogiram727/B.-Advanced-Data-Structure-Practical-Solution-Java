package Questions.F_Exercise_Java;

public class J_ErrorAndException {
    public static void main(String[] args) {
        // Example of an Error
        try {
            int[] arr = new int[Integer.MAX_VALUE]; // Causes OutOfMemoryError
        } catch (Error e) {
            System.out.println("Error occurred: " + e);
        }

        // Example of an Exception
        try {
            int result = 10 / 0; // Causes ArithmeticException
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}
