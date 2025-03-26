package Questions.D_Exception_Handling;

public class B_ThrowsExample {
    // Method that declares an exception
    public static void divide() throws ArithmeticException {
        int result = 10 / 0; // This will cause an ArithmeticException
    }

    public static void main(String[] args) {

        try {
            divide(); // Exception must be handled
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
