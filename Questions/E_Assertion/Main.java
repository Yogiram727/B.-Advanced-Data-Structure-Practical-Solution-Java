package Questions.E_Assertion;

public class Main {
    public static void main(String[] args) {
        int age = -1;

        // Using assertion to check the age
        assert age >= 0 : "Age cannot be negative"; // Assertion will fail if age < 0

        System.out.println("Age: " + age);
    }
}
