package javatpoint.polymorphism.runtime;

class Bike2 {
    int speedlimit = 90;
}

public class Honda2 extends Bike2 {
    int speedlimit = 150;

    public static void main(String[] args) {
        Bike2 bike2 = new Honda2();
        System.out.println(bike2.speedlimit);
    }
}
