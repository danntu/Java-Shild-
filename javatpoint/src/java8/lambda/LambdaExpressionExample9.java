package java8.lambda;

public class LambdaExpressionExample9 {
    public static void main(String[] args) {
        //Thread Example without lambda
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1 is running");
            }
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        //Thread Example with lambda
        Runnable runnable2 = () -> {
            System.out.println("Thread2 is running");
        };
        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }
}
