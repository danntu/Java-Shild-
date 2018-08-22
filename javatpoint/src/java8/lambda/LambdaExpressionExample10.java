package java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionExample10 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();
        //Adding Products
        list.add(new Product(1, "HP Laptop", 25000f));
        list.add(new Product(3, "Keyboard", 300f));
        list.add(new Product(2, "Dell Mouse", 150f));

        System.out.println("Sorting on the basis of name...");

        // implementing lambda expression
        Collections.sort(list, (o1, o2) -> (o1.name.compareTo(o2.name)));
        list.forEach(product -> System.out.println(product.id + " " + product.name + " " + product.price));

    }
}
