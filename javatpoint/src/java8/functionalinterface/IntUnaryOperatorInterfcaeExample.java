package java8.functionalinterface;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorInterfcaeExample {
    public static void main(String[] args) {
        IntUnaryOperator intUnaryOperator = operand -> operand * operand;
        System.out.println(intUnaryOperator.applyAsInt(5));
    }
}
