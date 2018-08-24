package java8.functionalinterface;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionInterfaceExample {
    public static void main(String[] args) {
        ToDoubleFunction<Integer> toDoubleFunction = value -> Math.sin(value);
        System.out.println(toDoubleFunction.applyAsDouble(Integer.MAX_VALUE));
    }
}
