package inner;

abstract class Person {
    abstract void eat();
}

public class TestAnonymousInner {
    public static void main(String[] args) {
        Person person = new Person() {
            @Override
            void eat() {
                System.out.println("nice fruits");
            }
        };
        person.eat();
    }
}
