package javatpoint.multithreading;

class ThreadExample extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread is running ...");
    }
}

class InterfaceExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread from interface is running ...");
    }
}

public class RunnerMultiThreading {
    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample();
        Thread t2 = new Thread(new InterfaceExample());
        t1.start();
        t2.start();
    }
}
