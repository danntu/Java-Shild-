package java8.collectors;

import java8.stream.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample3 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 30000f));
        productList.add(new Product(3, "Lenevo Laptop", 28000f));
        productList.add(new Product(4, "Sony Laptop", 28000f));
        productList.add(new Product(5, "Apple Laptop", 90000f));

        Double sumPrices =
                productList.stream()
                        .collect(Collectors.summingDouble(value -> value.getPrice()));
        System.out.println("Sum of prices: " + sumPrices);

        Integer sumId =
                productList.stream()
                        .collect(Collectors.summingInt(value -> value.getId()));
        System.out.println("Sum of id's : " + sumId);
    }
}
