package java8.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample2 {
    static void addList(List<Integer> list) {
        int result = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of list values: " + result);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);

        Consumer<List<Integer>> consumer = ConsumerInterfaceExample2::addList;
        consumer.accept(list);
    }
}
