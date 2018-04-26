package javatpoint.polymorphism.inst;

public class Dog3 extends Animal {
    static void method(Animal a) {
        if (a instanceof Dog3) {
            Dog3 dog3 = (Dog3) a;
            System.out.println("ok downcating performed");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Dog3();
        Dog3.method(animal);
    }
}
