package javatpoint.multithreading;

/**
 * Created by mdaniyar on 5/25/18.
 */
public class TestMultitasking5 {
    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("task 1");
            }
        };
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("task 2");
            }
        };
        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);
        t1.start();
        t2.start();
    }
}
