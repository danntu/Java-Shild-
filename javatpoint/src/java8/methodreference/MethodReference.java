package java8.methodreference;

@FunctionalInterface
interface Sayable {
    void say();
}

public class MethodReference {
    public static void saySomething() {
        System.out.println("Hello, this is static method.");
    }

    public static void main(String[] args) {
        //Refering static method
        Sayable sayable = MethodReference::saySomething;
        //Calling interface method
        sayable.say();
    }
}
