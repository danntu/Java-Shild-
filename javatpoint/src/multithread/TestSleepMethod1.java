package multithread;

public class TestSleepMethod1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestSleepMethod1 method1 = new TestSleepMethod1();
        TestSleepMethod1 method2 = new TestSleepMethod1();
        method1.start();
        method2.start();
    }
}
