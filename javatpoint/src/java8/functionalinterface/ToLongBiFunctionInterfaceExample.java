package java8.functionalinterface;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionInterfaceExample {
    public static void main(String[] args) {
        ToLongBiFunction<String, String> toLongBiFunction = (s, s2) ->
                Long.parseLong(s) + Long.parseLong(s2);
        System.out.println(toLongBiFunction.applyAsLong("3", "5"));
    }
}
