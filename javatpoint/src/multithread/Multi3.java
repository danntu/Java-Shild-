package multithread;

public class Multi3 implements Runnable {
    @Override
    public void run() {
        System.out.println("thread is running from interface");
    }

    public static void main(String[] args) {
        Multi3 multi3 = new Multi3();
        Thread thread = new Thread(multi3);
        thread.start();
    }
}
