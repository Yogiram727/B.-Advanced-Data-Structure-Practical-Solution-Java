package Questions.D_Exception_Handling;

public class D_UncheckedExceptionExample {
    public static void main(String[] args) {
        String str = null;

        System.out.println(str.length()); // Will throw NullPointerException
    }
}
