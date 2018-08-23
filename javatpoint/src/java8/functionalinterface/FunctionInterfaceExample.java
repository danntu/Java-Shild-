package java8.functionalinterface;

import java.util.function.Function;

public class FunctionInterfaceExample {
    static String show(String name) {
        return "Hello " + name;
    }

    public static void main(String[] args) {
        Function<String, String> function = FunctionInterfaceExample::show;
        System.out.println(function.apply("Danik"));
    }
}
