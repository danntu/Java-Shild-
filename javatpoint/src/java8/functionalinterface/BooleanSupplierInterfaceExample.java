package java8.functionalinterface;

import java.util.function.BooleanSupplier;

public class BooleanSupplierInterfaceExample {
    public static void main(String[] args) {
        BooleanSupplier booleanSupplier = () -> true;
        System.out.println(booleanSupplier.getAsBoolean());

        int x = 0, y = 1;
        booleanSupplier = () -> x > y;
        System.out.println(booleanSupplier.getAsBoolean());
    }
}
