package javatpoint.polymorphism;

class Animal2 {
    void eat() {
        System.out.println("eating");
    }
}

class Dog2 extends Animal2 {
    void eat() {
        System.out.println("dog eating bread");
    }

    void bark() {
        System.out.println("dog barking");
    }

    void work() {
        super.eat();
        bark();
    }
}

public class TestSuper2 {
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2();
        dog2.work();
    }
}
