package Questions.D_Exception_Handling;

class MyException extends Exception {
    // Constructor to pass the error message
    MyException(String message) {
        super(message);
    }
}

public class E_CustomException {
    // Method that throws the custom exception if the number is negative
    public static void checkNumber(int num) throws MyException {

        if (num < 0) {
            throw new MyException("Number cannot be negative!");

        } else {
            System.out.println("Valid number: " + num);
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5); // Will throw the custom exception
        } catch (MyException e) {
            // Handle the custom exception
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

}
