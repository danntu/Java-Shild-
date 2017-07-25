package glava27;

import java.util.concurrent.Semaphore;

class Q{
    int n;
    static Semaphore semCon = new Semaphore(0);
    static Semaphore semProd = new Semaphore(1);

    void get(){
        try{
            semCon.acquire();
        } catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Getted " + n);
        semProd.release();
    }
    void put(int n){
        try{
            semProd.acquire();
        } catch(InterruptedException e){
            System.out.println(e);
        }
        this.n=n;
        System.out.println("Sended " + n);
        semCon.release();
    }
}

class Producer implements Runnable{
    Q q;

    public Producer(Q q) {
        this.q = q;
        new Thread(this,"Producer").start();
    }

    @Override
    public void run() {
        for (int i=0;i<20;i++) q.put(i);
    }
}

class Consumer implements Runnable{
    Q q;

    public Consumer(Q q) {
        this.q = q;
        new Thread(this,"Consumer").start();
    }

    @Override
    public void run() {
        for (int i=0;i<20;i++) q.get();
    }
}

public class ProdCon {
    public static void main(String[] args) {
        Q q = new Q();
        new Consumer(q);
        new Producer(q);
    }
}
