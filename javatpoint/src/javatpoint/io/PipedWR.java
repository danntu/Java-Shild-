package javatpoint.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by mdaniyar on 5/30/18.
 */
public class PipedWR {
    public static void main(String[] args) throws IOException {
        final PipedOutputStream pout = new PipedOutputStream();
        final PipedInputStream pin = new PipedInputStream();

        pout.connect(pin);
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 65; i <= 90; i++) {
                    try {
                        pout.write(i);
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                try {
                    for (int i = 65; i <= 90; i++) {
                        System.out.println(pin.read());
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        };
        t1.start();
        t2.start();
    }
}
