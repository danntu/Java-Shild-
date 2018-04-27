package javatpoint.abstraction;

abstract class Bike2 {
    public Bike2() {
        System.out.println("bike is created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("gear changed");
    }
}

class Honda2 extends Bike2 {
    @Override
    void run() {
        System.out.println("running safely..");
    }
}

public class TestAbstraction2 {
    public static void main(String[] args) {
        Bike2 bike2 = new Honda2();
        bike2.run();
        bike2.changeGear();
    }
}
