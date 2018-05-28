package javatpoint.synchro;

import javafx.scene.control.Tab;

/**
 * Created by mdaniyar on 5/28/18.
 */
public class TestSynchronization5 {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                Table4.printTable(1);
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                Table4.printTable(10);
            }
        };
        Thread t3 = new Thread() {
            @Override
            public void run() {
                Table4.printTable(100);
            }
        };
        Thread t4 = new Thread4() {
            @Override
            public void run() {
                Table4.printTable(1000);
            }
        };
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
