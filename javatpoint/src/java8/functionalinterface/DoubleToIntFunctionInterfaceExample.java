package java8.functionalinterface;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionInterfaceExample {
    public static void main(String[] args) {
        DoubleToIntFunction doubleToIntFunction = value -> (int) value + 2;
        System.out.println(doubleToIntFunction.applyAsInt(3.14));
    }
}
