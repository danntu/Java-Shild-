package java8.functionalinterface;

import jdk.nashorn.internal.ir.FunctionNode;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceExample2 {
    static Integer addList(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Function<List<Integer>, Integer> function = FunctionInterfaceExample2::addList;
        int result = function.apply(list);
        System.out.println("Sum of list values " + result);
    }
}
