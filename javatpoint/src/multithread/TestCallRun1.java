package multithread;

public class TestCallRun1 extends Thread {
    @Override
    public void run() {
        System.out.println("running");
    }

    public static void main(String[] args) {
        TestCallRun1 testCallRun1 = new TestCallRun1();
        testCallRun1.run();
    }
}
