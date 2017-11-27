package m_1.by.bsu.threads;

public class SimpleThread extends Thread{
    @Override
    public void run() {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.err.println(e);
        }
        System.out.println("end of SimpleThread");
    }
}
