package java8.functionalinterface;

import java.util.function.ObjLongConsumer;

public class ObjLongConsumerInterfaceExample {
    public static void main(String[] args) {
        ObjLongConsumer<String> stringObjLongConsumer = (s, value) -> System.out.println(s + value);
        stringObjLongConsumer.accept("Danik ", Long.MAX_VALUE);
    }
}
