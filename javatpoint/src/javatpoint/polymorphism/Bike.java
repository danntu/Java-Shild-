package javatpoint.polymorphism;

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

public class Bike extends Vehicle {
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }
}
