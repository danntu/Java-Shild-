package javatpoint.polymorphism;

public class Bike9 {
    final int speedlimit = 90;

    void run() {
        //speedlimit=400; cannot change final variable
    }

    public static void main(String[] args) {
        Bike9 bike9 = new Bike9();
        bike9.run();
    }
}
