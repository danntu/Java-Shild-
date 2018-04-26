package javatpoint.polymorphism.runtime;

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("dog is eating bread...");
    }
}

class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("cat is eating rat...");
    }
}

class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("lion is eating meat...");
    }
}

public class TestPolymorphism3 {
    public static void main(String[] args) {
        Animal animal;

        animal = new Animal();
        animal.eat();

        animal = new Dog();
        animal.eat();

        animal = new Cat();
        animal.eat();

        animal = new Lion();
        animal.eat();

    }
}
