package java8.defaultmethod;

interface Sayable {
    default void say() {
        System.out.println("Hello, this is default method");
    }

    void sayMore(String msg);
}

public class DefaultMethods1 implements Sayable {
    @Override
    public void sayMore(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        DefaultMethods1 defaultMethods1 = new DefaultMethods1();
        defaultMethods1.say(); // calling default method
        defaultMethods1.sayMore("Danik"); //calling abstract method
    }
}
