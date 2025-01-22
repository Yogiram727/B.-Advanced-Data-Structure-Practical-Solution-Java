package Questions.C_Multithreading;

public class C_LambdaExpression {
    Runnable myThread = () -> {
        Thread.currentThread().setName("myThread");
        System.out.println(
                Thread.currentThread().getName() + " is running");

    };
}
