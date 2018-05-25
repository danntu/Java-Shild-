package javatpoint.multithreading;

/**
 * Created by mdaniyar on 5/25/18.
 */
public class TestMultitasking4 {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("task one");
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println("task two");
            }
        };
        t1.start();
        t2.start();
    }
}
