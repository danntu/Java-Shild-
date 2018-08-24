package java8.functionalinterface;

import java.util.function.ToLongFunction;

public class ToLongFunctionInterfaceExample {
    public static void main(String[] args) {
        ToLongFunction<String> toLongFunction = value -> Long.parseLong(value);
        System.out.println(toLongFunction.applyAsLong("123"));
    }
}
