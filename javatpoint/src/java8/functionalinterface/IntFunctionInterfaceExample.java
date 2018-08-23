package java8.functionalinterface;

import java.util.function.IntFunction;

public class IntFunctionInterfaceExample {
    public static void main(String[] args) {
        IntFunction<String> intFunction = value -> Integer.toString(value);
        System.out.println(intFunction.apply(3).length());
    }
}
