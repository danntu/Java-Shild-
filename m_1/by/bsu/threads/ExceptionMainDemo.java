package m_1.by.bsu.threads;

public class ExceptionMainDemo {
    public static void main(String[] args) {
        new SimpleThread().start();
        System.out.println("end of main exception");
        throw new RuntimeException();
    }
}
