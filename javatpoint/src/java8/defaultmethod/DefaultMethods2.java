package java8.defaultmethod;

interface Sayable2 {
    default void say() {
        System.out.println("This is default method");
    }

    void sayMore(String msg);

    static void sayLouder(String msg) {
        System.out.println(msg);
    }
}

public class DefaultMethods2 implements Sayable2 {
    @Override
    public void sayMore(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        DefaultMethods2 defaultMethods2 = new DefaultMethods2();
        defaultMethods2.say();
        defaultMethods2.sayMore("abstract method");
        Sayable2.sayLouder("Static method");
    }
}
