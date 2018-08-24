package java8.functionalinterface;

import java.util.function.LongPredicate;

public class LongPredicateInterfaceExample {
    public static void main(String[] args) {
        LongPredicate longPredicate = value -> value > 0;
        System.out.println(longPredicate.test(Long.MAX_VALUE));
    }
}
