package javatpoint.inheritance;

class Animal2 {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends Dog2 {
    void weep() {
        System.out.println("weeping");
    }
}

public class TestInheritance2 {
    public static void main(String[] args) {
        BabyDog babyDog = new BabyDog();
        babyDog.weep();
        babyDog.bark();
        babyDog.eat();
    }
}
