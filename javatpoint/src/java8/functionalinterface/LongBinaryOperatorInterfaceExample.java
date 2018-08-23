package java8.functionalinterface;

import java.util.function.LongBinaryOperator;

public class LongBinaryOperatorInterfaceExample {
    public static void main(String[] args) {
        LongBinaryOperator longBinaryOperator = (left, right) -> left / right;
        System.out.println(longBinaryOperator.applyAsLong(Long.MAX_VALUE, Long.MAX_VALUE));

    }
}
