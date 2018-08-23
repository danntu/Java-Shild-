package java8.functionalinterface;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionInterfaceExample {
    public static void main(String[] args) {
        IntToDoubleFunction intToDoubleFunction = value -> Math.sin(value);
        System.out.println(intToDoubleFunction.applyAsDouble(2));
    }
}
