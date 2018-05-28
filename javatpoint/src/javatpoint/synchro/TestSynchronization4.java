package javatpoint.synchro;

class Table4 {
    synchronized static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        Table4.printTable(1);
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        Table4.printTable(10);
    }
}

class Thread3 extends Thread {
    @Override
    public void run() {
        Table4.printTable(100);
    }
}

class Thread4 extends Thread {
    @Override
    public void run() {
        Table4.printTable(1000);
    }
}

public class TestSynchronization4 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        Thread3 thread3 = new Thread3();
        Thread4 thread4 = new Thread4();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
