package java8.functionalinterface;

import java.util.function.BiPredicate;

public class BiPredicateInterfaceExample {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (integer, integer2) -> integer > integer2;
        System.out.println(biPredicate.test(2, 3));
    }
}
