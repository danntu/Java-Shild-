package java8.functionalinterface;

import java.util.function.ObjDoubleConsumer;

public class ObjDoubleConsumerInterfaceExample {
    public static void main(String[] args) {
        ObjDoubleConsumer<String> stringObjDoubleConsumer = (s, value) -> System.out.println(s + value);
        stringObjDoubleConsumer.accept("Danik ", 0.12345);
    }
}
