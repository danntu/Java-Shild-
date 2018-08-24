package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 30000f));
        productList.add(new Product(3, "Lenevo Laptop", 28000f));
        productList.add(new Product(4, "Sony Laptop", 28000f));
        productList.add(new Product(5, "Apple Laptop", 90000f));

        List<Float> productPriceList = new ArrayList<>();

        for (Product product :
                productList) {
            if (product.price < 30000) {
                productPriceList.add(product.price);
            }
        }
        System.out.println(productPriceList);
    }
}
