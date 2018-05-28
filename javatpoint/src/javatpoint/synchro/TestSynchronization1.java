package javatpoint.synchro;


class Table {
    void printTable(int n) {
        synchronized (this) {
            for (int i = 1; i <= n; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class MyThread1 extends Thread {
    Table table;

    MyThread1(Table table) {
        this.table = table;
    }

    public void run() {
        table.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table table;

    public MyThread2(Table table) {
        this.table = table;
    }

    public void run() {
        table.printTable(100);
    }
}

public class TestSynchronization1 {
    public static void main(String[] args) {
        Table table = new Table();
        MyThread1 myThread1 = new MyThread1(table);
        MyThread2 myThread2 = new MyThread2(table);
        myThread1.start();
        myThread2.start();
    }
}
