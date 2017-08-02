package glava27;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpExec {
    public static void main(String[] args) {
        CountDownLatch downLatch1 = new CountDownLatch(5);
        CountDownLatch downLatch2 = new CountDownLatch(5);
        CountDownLatch downLatch3 = new CountDownLatch(5);
        CountDownLatch downLatch4 = new CountDownLatch(5);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        System.out.println("Start");
        executorService.execute(new MyThread("A",downLatch1));
        executorService.execute(new MyThread("B",downLatch2));
        executorService.execute(new MyThread("C",downLatch3));
        executorService.execute(new MyThread("D",downLatch4));

        try{
            downLatch1.await();
            downLatch2.await();
            downLatch3.await();
            downLatch4.await();
        } catch (InterruptedException e){
            System.out.println(e);
        }

        executorService.shutdown();
        System.out.println("End of the program");
    }
}
class MyThread implements Runnable{
    String name;
    CountDownLatch latch;

    public MyThread(String name, CountDownLatch latch) {
        this.name = name;
        this.latch = latch;
        new Thread(this);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name+": "+i);
            latch.countDown();
        }
    }
}
