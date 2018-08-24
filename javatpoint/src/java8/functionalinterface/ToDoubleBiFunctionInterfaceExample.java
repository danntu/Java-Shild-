package java8.functionalinterface;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionInterfaceExample {
    public static void main(String[] args) {
        ToDoubleBiFunction<Integer, Long> doubleBiFunction = (integer, aLong) ->
                Math.sin(integer) + Math.sin(aLong);
        System.out.println(doubleBiFunction.applyAsDouble(Integer.MAX_VALUE, Long.MAX_VALUE));
    }
}
