package java8.optional;

import java.util.Optional;

public class OptionalExample3 {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if (checkNull.isPresent()) {
            String lowercaseString = str[5].toLowerCase();
            System.out.println(lowercaseString);
        } else {
            System.out.println("String value is not present");
        }
    }
}
