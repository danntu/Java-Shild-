package java8.functionalinterface;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOpertorInterfaceExample {
    public static void main(String[] args) {
        DoubleBinaryOperator doubleBinaryOperator = (left, right) -> left * right;
        System.out.println(doubleBinaryOperator.applyAsDouble(0.23, 0.45));
    }
}
