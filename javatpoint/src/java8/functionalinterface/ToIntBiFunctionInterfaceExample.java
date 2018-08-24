package java8.functionalinterface;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionInterfaceExample {
    public static void main(String[] args) {
        ToIntBiFunction<String, String> toIntBiFunction = (s, s2) -> Integer.parseInt(s) + Integer.parseInt(s2);
        System.out.println(toIntBiFunction.applyAsInt("7", "9"));
    }
}
