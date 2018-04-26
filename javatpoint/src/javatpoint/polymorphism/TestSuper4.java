package javatpoint.polymorphism;

class Animal4 {
    public Animal4() {
        System.out.println("animal is creted");
    }
}

class Dog4 extends Animal4 {
    public Dog4() {
        System.out.println("dog is created");
    }
}

public class TestSuper4 {
    public static void main(String[] args) {
        Dog4 dog4 = new Dog4();
    }
}
