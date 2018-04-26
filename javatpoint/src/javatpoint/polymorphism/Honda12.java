package javatpoint.polymorphism;

class Bike12 {
    final void run() {
        System.out.println("running...");
    }
}

public class Honda12 extends Bike12 {
    public static void main(String[] args) {
        new Honda12().run();
    }
}
