package java8.functionalinterface;

import java.util.function.ObjIntConsumer;

public class ObjIntConsumerInterfaceExample {
    public static void main(String[] args) {
        ObjIntConsumer<String> stringObjIntConsumer = (s, value) -> System.out.println(s + value);
        stringObjIntConsumer.accept("Danik ", 32);
    }
}
