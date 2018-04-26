package javatpoint.polymorphism.runtime;

class Animal5 {
    void eat() {
        System.out.println("animal is eating ...");
    }
}

class Dog5 extends Animal5 {
    @Override
    void eat() {
        System.out.println("dog is eating ...");
    }
}

public class BabyDog1 extends Dog5 {
    public static void main(String[] args) {
        Animal5 animal5 = new BabyDog1();
        animal5.eat();
    }
}
