package java8.functionalinterface;

import java.util.function.DoubleConsumer;

public class DoubleConsumerInterfaceExample {
    public static void main(String[] args) {
        DoubleConsumer doubleConsumer = value -> System.out.println(value * value);
        doubleConsumer.accept(0.23);
    }
}
