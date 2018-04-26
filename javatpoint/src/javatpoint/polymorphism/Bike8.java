package javatpoint.polymorphism;

public class Bike8 {
    int speed;

    Bike8() {
        System.out.println("constructor is invoked");
    }

    {
        System.out.println("instance initializer block invoked");
    }

    public static void main(String[] args) {
        Bike8 bike81 = new Bike8();
        Bike8 bike82 = new Bike8();
    }
}
