package javatpoint.multithreading;

import org.junit.Test;

public class TestDaemonThread1 extends Thread {
    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("daemon thread work");
        } else {
            System.out.println("user thread work");
        }
    }

    public static void main(String[] args) {
        TestDaemonThread1 t1 = new TestDaemonThread1();
        TestDaemonThread1 t2 = new TestDaemonThread1();
        TestDaemonThread1 t3 = new TestDaemonThread1();

        t1.setDaemon(true);
        t1.start();
        t2.start();
        //t2.setDaemon(true); //If you want to make a user thread as Daemon, it must not be started otherwise it will throw IllegalThreadStateException.
        t3.start();

    }
}
