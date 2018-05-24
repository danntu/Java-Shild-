package multithread;

public class TestThreadTwice1 extends Thread {
    @Override
    public void run() {
        System.out.println("running...");
    }

    public static void main(String[] args) {
        TestThreadTwice1 twice1 = new TestThreadTwice1();
        twice1.start();
        twice1.start();
    }
}
