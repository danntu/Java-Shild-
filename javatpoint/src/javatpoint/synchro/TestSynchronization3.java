package javatpoint.synchro;

/**
 * Created by mdaniyar on 5/28/18.
 */
public class TestSynchronization3 {
    public static void main(String[] args) {
        final Table table = new Table();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                table.printTable(5);
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                table.printTable(100);
            }
        };
        t1.start();
        t2.start();
    }
}
