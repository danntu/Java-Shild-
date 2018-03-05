package m_1.by.bsu.threads;

public class Broker extends Thread {
    private Market market;
    private static final int PAUSE = 500;

    public Broker(Market market){
        thistest.market=market;
    }

    @Override
    public void run() {
        try{
            while (true){
                System.out.println("Current index: "+market.getIndex());
                Thread.sleep(PAUSE);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
