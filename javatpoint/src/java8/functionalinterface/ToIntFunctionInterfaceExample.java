package java8.functionalinterface;

import java.util.function.ToIntFunction;

public class ToIntFunctionInterfaceExample {
    public static void main(String[] args) {
        ToIntFunction<String> toIntFunction = value -> Integer.parseInt(value);
        System.out.println(toIntFunction.applyAsInt("2"));
    }
}
