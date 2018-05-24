package javatpoint.multithreading;

public class TestJoinMethod4 extends Thread {
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
    }

    public static void main(String[] args) {
        TestJoinMethod4 t1 = new TestJoinMethod4();
        TestJoinMethod4 t2 = new TestJoinMethod4();

        t1.start();
        t2.start();
    }
}
