package javatpoint.polymorphism.inst;

public class Dog4 extends Animal {
    static void method(Animal a) {
        Dog4 dog4 = (Dog4) a;
        System.out.println("ok downcasting performed");
    }

    public static void main(String[] args) {
        Animal animal = new Dog4();
        Dog4.method(animal);
    }
}
