package java8.functionalinterface;

import java.util.function.IntSupplier;

public class IntSupllier {
    public static void main(String[] args) {
        IntSupplier intSupllier = () -> Integer.MAX_VALUE;
        System.out.println(intSupllier.getAsInt());
    }
}
