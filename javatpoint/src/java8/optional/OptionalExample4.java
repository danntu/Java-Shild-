package java8.optional;

import java.util.Optional;

public class OptionalExample4 {
    public static void main(String[] args) {
        String str[] = new String[10];
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        checkNull.ifPresent(System.out::println);
        System.out.println(checkNull.get());
        System.out.println(str[5].toLowerCase());
    }
}
