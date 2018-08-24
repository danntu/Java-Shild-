package java8.functionalinterface;

import java.util.function.Supplier;

public class SupplierInterfaceExample {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "Danik";
        System.out.println(stringSupplier.get());
    }
}
