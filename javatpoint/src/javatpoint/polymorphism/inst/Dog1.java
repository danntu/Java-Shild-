package javatpoint.polymorphism.inst;

class Animal {

}

public class Dog1 extends Animal {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1();
        System.out.println(dog1 instanceof Animal);
    }
}
