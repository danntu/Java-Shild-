package javatpoint.inheritance;

class Animal3 {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog3 extends Animal3 {
    void bark() {
        System.out.println("barking...");
    }
}

class Cat3 extends Animal3 {
    void meow() {
        System.out.println("meowing...");
    }
}

public class TestInheritance3 {
    public static void main(String[] args) {
        System.out.println("Cat object");
        Cat3 cat3 = new Cat3();
        cat3.meow();
        cat3.eat();

        System.out.println("\nDog object");
        Dog3 dog3 = new Dog3();
        dog3.bark();
        dog3.eat();
    }
}
