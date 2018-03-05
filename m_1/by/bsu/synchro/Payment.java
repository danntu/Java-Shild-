package m_1.by.bsu.synchro;

import java.util.Scanner;

public class Payment {
    private int amount;
    private  boolean close;

    public int getAmount() {
        return amount;
    }

    public boolean isClose() {
        return close;
    }

    public synchronized void doPayment(){
        try{
            System.out.println("Start payment");
            while (amount<=0){
                thistest.wait();
            }
            close=true;
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Payment is closed: "+close);
    }
    public void initAmount(){
        Scanner sc = new Scanner(System.in);
        amount=sc.nextInt();
    }

}
