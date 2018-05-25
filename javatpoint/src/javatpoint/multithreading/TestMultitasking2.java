package javatpoint.multithreading;

/**
 * Created by mdaniyar on 5/25/18.
 */
public class TestMultitasking2 implements Runnable {
    @Override
    public void run() {
        System.out.println("task one");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new TestMultitasking2());
        Thread t2 = new Thread(new TestMultitasking2());

        t1.start();
        t2.start();
    }
}
