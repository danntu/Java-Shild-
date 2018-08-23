package java8.functionalinterface;

import java.util.function.DoubleSupplier;

public class DoubleSupplierInerfaceExample {
    public static void main(String[] args) {
        DoubleSupplier doubleSupplier = () -> 3.14d;
        System.out.println(doubleSupplier.getAsDouble());
    }
}
