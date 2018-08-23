package java8.functionalinterface;

import java.util.function.DoublePredicate;

public class DoublePredicateIneefaceExample {
    public static void main(String[] args) {
        DoublePredicate doublePredicate = value -> value > 0;
        System.out.println(doublePredicate.test(-0.5));
    }
}
