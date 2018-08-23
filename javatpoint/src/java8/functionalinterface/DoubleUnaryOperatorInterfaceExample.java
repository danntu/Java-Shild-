package java8.functionalinterface;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorInterfaceExample {
    public static void main(String[] args) {
        DoubleUnaryOperator doubleUnaryOperator = operand -> operand * operand;
        System.out.println(doubleUnaryOperator.applyAsDouble(3.14));
    }
}
