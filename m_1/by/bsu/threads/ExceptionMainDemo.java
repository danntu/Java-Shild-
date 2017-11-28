package m_1.by.bsu.threads;

import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

public class ExceptionMainDemo {
    public static void main(String[] args) {
        new SimpleThread().start();
        System.out.println("end of main exception");
        throw new RuntimeException();



    }
}
