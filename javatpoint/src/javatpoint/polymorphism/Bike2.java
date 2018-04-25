package javatpoint.polymorphism;

class Vehicle2 {
    void run() {
        System.out.println("Vehicle is running");
    }
}

public class Bike2 extends Vehicle2 {
    void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 bike2 = new Bike2();
        bike2.run();
    }
}
