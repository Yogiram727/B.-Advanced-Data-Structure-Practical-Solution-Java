package Questions.D_Exception_Handling;

public class A_ThrowExample {

    public static void main(String[] args) {

        try {
            checkAge(15);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); //
        }
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older");

        }
        System.out.println("Age is valid");
    }
}