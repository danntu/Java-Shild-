package java8.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Football");
        list.add("Basketball");
        list.add("Chess");
        list.add("Hocky");
        System.out.println("-----Iterating by passing lambda expression-----");

        list.forEach(System.out::println);
    }
}
