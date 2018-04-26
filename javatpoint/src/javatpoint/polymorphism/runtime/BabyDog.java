package javatpoint.polymorphism.runtime;

class Animal4 {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog4 extends Animal4 {
    @Override
    void eat() {
        System.out.println("dog is eating fruits");
    }
}

public class BabyDog extends Dog4 {
    void eat() {
        System.out.println("babydog is drinking milk");
    }

    public static void main(String[] args) {
        Animal4 animal1, animal2, animal3;

        animal1 = new Animal4();
        animal2 = new Dog4();
        animal3 = new BabyDog();
        animal1.eat();
        animal2.eat();
        animal3.eat();
    }
}
