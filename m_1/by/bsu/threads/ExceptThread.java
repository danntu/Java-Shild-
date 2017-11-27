package m_1.by.bsu.threads;

public class ExceptThread extends Thread{
    @Override
    public void run() {
        boolean flag = true;
        if (flag){
            throw  new RuntimeException();
        }
        System.out.println("end of ExceptThread");
    }
}
