package java8.methodreference;

@FunctionalInterface
interface Sayable4 {
    void say();
}

public class InstanceMethodReference {
    public void saySomething() {
        System.out.println("Hello, this is non-static method");
    }

    public static void main(String[] args) {
        //creating object
        InstanceMethodReference methodReference = new InstanceMethodReference();
        //refering non-static method using reference
        Sayable4 sayable = methodReference::saySomething;
        //calling interface method
        sayable.say();
    }
}
