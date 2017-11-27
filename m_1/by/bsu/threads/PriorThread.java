package m_1.by.bsu.threads;

public class PriorThread extends Thread{
    public PriorThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 71; i++) {
            System.out.println(getName()+" "+i);
            try{
                Thread.sleep(1);
            } catch (InterruptedException e){
                System.err.println(e);
            }
        }
    }
}
