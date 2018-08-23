package java8.functionalinterface;

import java.util.function.IntPredicate;

public class IntPredicateInterfaceExample {
    public static void main(String[] args) {
        IntPredicate intPredicate = value -> value < 0;
        System.out.println(intPredicate.test(123));
    }
}
