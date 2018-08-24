package java8.functionalinterface;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleFunctionInterfaceExample {
    public static void main(String[] args) {
        LongToDoubleFunction longToDoubleFunction = value -> Math.sin(value);
        System.out.println(longToDoubleFunction.applyAsDouble(Long.MAX_VALUE));
    }
}
