package javatpoint.polymorphism;

public class Bike7 {
    int speed;

    public Bike7() {
        System.out.println("speed is " + speed);
    }

    {
        speed = 100;
    }

    public static void main(String[] args) {
        Bike7 bike7_1 = new Bike7();
        Bike7 bike7_2 = new Bike7();
    }
}
