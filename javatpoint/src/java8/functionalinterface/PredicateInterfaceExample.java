package java8.functionalinterface;

import java.util.function.Predicate;

public class PredicateInterfaceExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = integer -> (integer > 18);
        System.out.println(predicate.test(20));
    }
}
