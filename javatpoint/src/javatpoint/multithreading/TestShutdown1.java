package javatpoint.multithreading;

/**
 * Created by mdaniyar on 5/25/18.
 */
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("shut down hook task completed..");
    }
}

public class TestShutdown1 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.addShutdownHook(new MyThread());
        System.out.println("Now main is sleeping... press ctrl+c to exit");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
