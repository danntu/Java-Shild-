package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample1 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 30000f));
        productList.add(new Product(3, "Lenevo Laptop", 28000f));
        productList.add(new Product(4, "Sony Laptop", 28000f));
        productList.add(new Product(5, "Apple Laptop", 90000f));

        List<Float> productPriceList = productList.stream()
                .filter(product -> product.price > 30000)
                .map(product -> product.price)
                .collect(Collectors.toList());
        System.out.println(productPriceList);
    }
}
