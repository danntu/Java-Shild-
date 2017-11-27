package m_1.by.bsu.threads;

public class ExceptionThreadDemo {
    public static void main(String[] args) throws InterruptedException{
        new ExceptThread().start();
        Thread.sleep(1000);
        System.out.println("end of main");
    }
}
