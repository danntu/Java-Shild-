package java8.functionalinterface;

import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorInterfaceExample {
    public static void main(String[] args) {
        LongUnaryOperator longUnaryOperator = operand -> -operand;
        System.out.println(longUnaryOperator.applyAsLong(Long.MAX_VALUE));
    }
}
