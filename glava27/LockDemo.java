package glava27;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.locks.*;

public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new LockThread("A",lock);
        new LockThread("B",lock);
    }
}
class Shared2{
    static int count =0;
}
class LockThread implements Runnable{
    String name;
    ReentrantLock lock;

    public LockThread(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Start "+name);

        try{
            System.out.println(name+" waiting block");
            lock.lock();
            System.out.println(name+" blocking");
            Shared2.count++;
            System.out.println(name+" suspend");
            System.out.println(name+" : "+Shared2.count);
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println(e);
        } finally{
            System.out.println(name+" unblock");
            lock.unlock();
        }

    }
}