package java8.functionalinterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (integer, integer2) -> integer + integer2;
        System.out.println(binaryOperator.apply(5, 6));
    }
}
