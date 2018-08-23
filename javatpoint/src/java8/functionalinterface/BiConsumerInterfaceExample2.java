package java8.functionalinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerInterfaceExample2 {
    static void showDetails(Map<Integer, String> map, String mapName) {
        System.out.println("-------------" + mapName + "--------------");
        map.forEach((integer, s) -> System.out.println(integer + " " + s));
    }

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Danik");
        map.put(110, "Aset");
        map.put(115, "Marat");
        map.put(120, "Daulet");

        BiConsumer<Map<Integer, String>, String> biConsumer = BiConsumerInterfaceExample2::showDetails;
        biConsumer.accept(map, "Student");
    }
}
