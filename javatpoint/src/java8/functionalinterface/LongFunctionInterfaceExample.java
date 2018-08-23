package java8.functionalinterface;

import java.util.function.LongFunction;

public class LongFunctionInterfaceExample {
    public static void main(String[] args) {
        LongFunction<String> stringLongFunction = value -> Long.toString(value);
        System.out.println(stringLongFunction.apply(Long.MAX_VALUE));
    }
}
