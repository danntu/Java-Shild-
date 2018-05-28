package javatpoint.synchro;

/**
 * Created by mdaniyar on 5/28/18.
 */
public class TestInterruptingThread2 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception handled " + e);
        }
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        TestInterruptingThread2 t1 = new TestInterruptingThread2();
        t1.start();
        t1.interrupt();
    }
}
