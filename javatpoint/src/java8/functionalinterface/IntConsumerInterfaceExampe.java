package java8.functionalinterface;

import java.util.function.IntConsumer;

public class IntConsumerInterfaceExampe {
    public static void main(String[] args) {
        IntConsumer intConsumer = value -> System.out.println(value);
        intConsumer.accept(123);
    }
}
