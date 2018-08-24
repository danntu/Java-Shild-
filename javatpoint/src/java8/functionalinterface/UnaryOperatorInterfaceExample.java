package java8.functionalinterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceExample {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
        System.out.println(unaryOperator.apply("danik"));
    }
}
