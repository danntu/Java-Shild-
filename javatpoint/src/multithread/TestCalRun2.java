package multithread;


public class TestCalRun2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestCalRun2 testCallRun2 = new TestCalRun2();
        TestCalRun2 testCallRun21 = new TestCalRun2();
        testCallRun2.run();
        testCallRun21.run();
    }
}
