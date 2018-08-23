package java8.functionalinterface;

import java.util.function.DoubleFunction;

public class DoubleFunctionInterfaceExample {
    public static void main(String[] args) {
        DoubleFunction<String> doubleFunction = value -> value + " is now a string";
        System.out.println(doubleFunction.apply(0.5));
    }
}
