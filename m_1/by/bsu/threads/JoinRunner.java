package m_1.by.bsu.threads;

class JoinThread extends Thread{
    public JoinThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        String nameT= getName();
        long timeout=0;
        System.out.println("Start flow "+nameT);
        try{
            switch (nameT){
                case "First": timeout  = 5_000;
                case "Second": timeout = 5_000;
            }
            Thread.sleep(timeout);
            System.out.println("End of flow "+nameT);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class JoinRunner {
    static {
        System.out.println("Start main flow");
    }

    public static void main(String[] args) {
        JoinThread t1  = new JoinThread("First");
        JoinThread t2  = new JoinThread("Second");
        t1.start();
        t2.start();
        try{
            t1.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
