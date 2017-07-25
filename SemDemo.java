package glava27;

import java.util.concurrent.Semaphore;

public class SemDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        new IncThread("A",semaphore);
        new DecThread(semaphore,"B");
    }
}
class Shared{
    static  int count = 0;
}
class IncThread implements Runnable{
    String name;
    Semaphore semaphore;

    public IncThread(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Run " + name);
        try {
            System.out.println(name+ " waiting access");
            semaphore.acquire();
            System.out.println(name+ " getting access");

            for (int i = 0; i < 5 ; i++) {
                Shared.count++;
                System.out.println(name+" : "+Shared.count);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println(name+" free access");
        semaphore.release();
    }
}
class DecThread implements Runnable{

    Semaphore semaphore;
    String name;

    public DecThread(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Run " + name);
        try {
            System.out.println(name+ " waiting access");
            semaphore.acquire();
            System.out.println(name+ " getting access");

            for (int i = 0; i < 5 ; i++) {
                Shared.count--;
                System.out.println(name+" : "+Shared.count);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println(name+" free access");
        semaphore.release();
    }
}