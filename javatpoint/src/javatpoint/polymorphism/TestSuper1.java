package javatpoint.polymorphism;

class Animal {
    String color = "white";
}

class Dog extends Animal {
    String color = "black";
    void printColor() {
        System.out.println(color); // print color of Dog class
        System.out.println(super.color); // print color of Animal class
    }
}

public class TestSuper1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printColor();
    }
}
