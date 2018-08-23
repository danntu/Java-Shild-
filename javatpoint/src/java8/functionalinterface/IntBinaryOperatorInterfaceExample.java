package java8.functionalinterface;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorInterfaceExample {
    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (left, right) -> left + right;
        System.out.println(intBinaryOperator.applyAsInt(2, 3));
    }
}
