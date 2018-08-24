package java8.functionalinterface;

import java.util.function.LongSupplier;

public class LongSupplierInterfaceExample {
    public static void main(String[] args) {
        LongSupplier longSupplier = () -> Long.MAX_VALUE;
        System.out.println(longSupplier.getAsLong());
    }
}
