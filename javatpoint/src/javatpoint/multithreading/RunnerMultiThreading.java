package javatpoint.multithreading;

class ThreadExample extends Thread {
    @Override
    public void run() {
        System.out.println("thread is running ...");
        for (int i = 1; i <= 5; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " i = " + i);
        }

    }
}

class InterfaceExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread from interface is running ...");
        for (int i = 1; i <= 5; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " i = " + i);
        }
    }
}

public class RunnerMultiThreading {
    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample();
        Thread t2 = new Thread(new InterfaceExample());
        t1.start();
        t1.start();
        t2.start();
    }
}
