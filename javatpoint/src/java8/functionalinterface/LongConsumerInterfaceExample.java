package java8.functionalinterface;

import java.util.function.LongConsumer;

public class LongConsumerInterfaceExample {
    public static void main(String[] args) {
        LongConsumer longConsumer = value -> System.out.println(value);
        longConsumer.accept(Long.MAX_VALUE);
    }
}
