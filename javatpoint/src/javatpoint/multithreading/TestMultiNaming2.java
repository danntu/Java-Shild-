package javatpoint.multithreading;

public class TestMultiNaming2 extends Thread {
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println("Default thread name " + thread.getName());
    }

    public static void main(String[] args) {
        TestMultiNaming2 t1 = new TestMultiNaming2();
        TestMultiNaming2 t2 = new TestMultiNaming2();
        t1.start();
        t2.start();
    }
}
