package java8.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachOrderedExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Football");
        list.add("Basketball");
        list.add("Chess");
        list.add("Hocky");
        System.out.println("-----Iterating by passing lambda expression-----");
        list.stream().forEach(s -> System.out.println(s));
        System.out.println("------------Iterating by passing method reference---------------");
        list.stream().forEachOrdered(System.out::println);
    }
}
