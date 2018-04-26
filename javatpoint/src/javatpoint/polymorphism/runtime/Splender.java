package javatpoint.polymorphism.runtime;

class Bike {
    void run() {
        System.out.println("Bike is running");
    }
}

public class Splender extends Bike {
    void run() {
        System.out.println("Splender is running safely with 60km");
    }

    public static void main(String[] args) {
        Bike bike = new Splender();
        bike.run();
    }
}
