package glava27;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int curPhase;
        System.out.println("Starting");

        new MyThtread(phaser,"A");
        new MyThtread(phaser,"B");
        new MyThtread(phaser,"C");

        curPhase=phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+curPhase+" Complete");

        curPhase=phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+curPhase+" Complete");

        curPhase=phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+curPhase+" Complete");

        phaser.arriveAndDeregister();
        if (phaser.isTerminated())
            System.out.println("The Pahser is Terminated");
    }
}
class MyThtread implements Runnable{
    Phaser phaser;
    String name;

    public MyThtread(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        this.phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Thread "+name+" Begining Phase One");
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(10);
        } catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Thread "+name+" Begining Phase Two");
        phaser.arriveAndAwaitAdvance();
        try{
            Thread.sleep(10);
        } catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Thread "+ name+ " Begining Phase Three");
        phaser.arriveAndDeregister();
    }
}