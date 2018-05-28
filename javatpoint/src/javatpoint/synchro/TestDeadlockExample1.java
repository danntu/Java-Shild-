package javatpoint.synchro;

/**
 * Created by mdaniyar on 5/28/18.
 */
public class TestDeadlockExample1 {
    public static void main(String[] args) {
        final String resource1 = "Danik1";
        final String resource2 = "Danik2";
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1 : locked resource 1");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    synchronized (resource2) {
                        System.out.println("Thread 1 : locked resource 2");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2 : locked resource 2");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    synchronized (resource1) {
                        System.out.println("Thread 2 : locked resource 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
