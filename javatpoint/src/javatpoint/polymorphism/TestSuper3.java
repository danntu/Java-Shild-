package javatpoint.polymorphism;

class Animal3 {
    Animal3() {
        System.out.println("animal is created");
    }
}

class Dog3 extends Animal3 {
    Dog3() {
        super();
        System.out.println("dog is created");
    }
}

public class TestSuper3 {
    public static void main(String[] args) {
        Dog3 dog3 = new Dog3();

    }
}
