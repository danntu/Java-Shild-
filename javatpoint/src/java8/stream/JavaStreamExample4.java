package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample4 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 30000f));
        productList.add(new Product(3, "Lenevo Laptop", 28000f));
        productList.add(new Product(4, "Sony Laptop", 28000f));
        productList.add(new Product(5, "Apple Laptop", 90000f));

        Float totalPrice = productList.stream()
                .map(product -> product.price)
                .reduce(0.0f, (aFloat, aFloat2) -> aFloat + aFloat2);
        System.out.println(totalPrice);

        Float totalPrice2 = productList.stream()
                .map(product -> product.price)
                .reduce(0.0f, Float::sum);
        System.out.println(totalPrice2);
    }
}
