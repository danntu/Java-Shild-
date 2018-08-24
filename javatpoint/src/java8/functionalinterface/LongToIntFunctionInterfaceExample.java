package java8.functionalinterface;

import java.util.function.LongToIntFunction;

public class LongToIntFunctionInterfaceExample {
    public static void main(String[] args) {
        LongToIntFunction longToIntFunction = value -> (int) value;
        System.out.println(longToIntFunction.applyAsInt(Long.MAX_VALUE));
    }
}
