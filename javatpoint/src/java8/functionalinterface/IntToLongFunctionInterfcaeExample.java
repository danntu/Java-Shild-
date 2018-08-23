package java8.functionalinterface;

import java.util.function.IntToLongFunction;

public class IntToLongFunctionInterfcaeExample {
    public static void main(String[] args) {
        IntToLongFunction intToLongFunction = value -> Long.MAX_VALUE - value;
        System.out.println(intToLongFunction.applyAsLong(2));
    }
}
