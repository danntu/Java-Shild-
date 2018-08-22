package java8.functionalinterface;

@FunctionalInterface
interface Sayable2 {
    void say(String msg);

    int hashCode();

    String toString();

    boolean equals(Object obj);
}

public class FunctionalInterfaceExample2 implements Sayable2 {
    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample2 functionalInterfaceExample2 = new FunctionalInterfaceExample2();
        functionalInterfaceExample2.say("Hello there");
    }
}
