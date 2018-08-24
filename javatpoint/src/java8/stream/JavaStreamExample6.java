package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample6 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 30000f));
        productList.add(new Product(3, "Lenevo Laptop", 28000f));
        productList.add(new Product(4, "Sony Laptop", 28000f));
        productList.add(new Product(5, "Apple Laptop", 90000f));

        Product producMax = productList.stream()
                .max((o1, o2) -> o1.price > o2.price ? 1 : -1).get();
        System.out.println("Max price " + producMax.price);

        Product productMin = productList.stream()
                .max((o1, o2) -> o1.price < o2.price ? 1 : -1).get();
        System.out.println("Min price " + productMin.price);
    }
}
