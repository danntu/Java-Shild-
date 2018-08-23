package java8.functionalinterface;

import java.util.function.DoubleToLongFunction;

public class DoubleToLongFunctionInterfaceExample {
    public static void main(String[] args) {
        DoubleToLongFunction doubleToLongFunction = value -> Long.MAX_VALUE - (long) value;
        System.out.println(doubleToLongFunction.applyAsLong(3.14));
    }
}
