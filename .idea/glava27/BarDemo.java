package glava27;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3,new BarAction());
        System.out.println("Запуск");
        new MyThread2(barrier,"A");
        new MyThread2(barrier,"B");
        new MyThread2(barrier,"C");
        new MyThread2(barrier,"D");
    }
}
class MyThread2 implements Runnable{
    CyclicBarrier barrier;
    String name;

    public MyThread2(CyclicBarrier barrier, String name) {
        this.barrier = barrier;
        this.name = name;
        new Thread(this).start();
    }
    @Override
    public void run() {
        System.out.println(name);
        try {
            barrier.await();
        } catch (BrokenBarrierException | InterruptedException e){
            System.out.println(e);
        }
    }
}
class BarAction implements Runnable{
    @Override
    public void run() {
        System.out.println("Барьер достигнут! ");
    }
}