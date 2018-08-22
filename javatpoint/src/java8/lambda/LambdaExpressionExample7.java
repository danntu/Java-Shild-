package java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Test1");
        list.add("Test2");
        list.add("Test3");
        list.add("Test4");

        list.forEach(s -> {
            System.out.println(s);
        });
        System.out.println("Another foreach");
        list.forEach(s -> System.out.println(s));
    }
}
