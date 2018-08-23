package java8.functionalinterface;

import java.util.function.BiConsumer;

public class BiConsumerInterfaceExample {
    static void showDetails(String name, Integer age) {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer1 = BiConsumerInterfaceExample::showDetails;
        biConsumer1.accept("Daniyar", 32);
        biConsumer1.accept("Moldir", 28);

        BiConsumer<String, Integer> biConsumer2 = (s, integer) -> System.out.println(s + " " + integer);
        biConsumer2.accept("Peter", 35);
    }
}
