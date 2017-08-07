package glava27;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static void main(String[] args) {
        new AtomThread("A");
        new AtomThread("B");
        new AtomThread("C");
    }
}
class Shared3{
    static AtomicInteger atomicInteger = new AtomicInteger(0);
}
class AtomThread implements Runnable{
    String name;

    public AtomThread(String name) {
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Run "+name);
        for (int i = 1; i <=3 ; i++) {
            System.out.println(name+" get " +Shared3.atomicInteger.getAndSet(i));
        }
    }
}
