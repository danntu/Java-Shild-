package javatpoint.multithreading;

public class WorkerThread implements Runnable {
    private String message;

    public WorkerThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " (Start) message = " + message);
        processmessage();
        System.out.println(threadName + " (End)");
    }

    private void processmessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
