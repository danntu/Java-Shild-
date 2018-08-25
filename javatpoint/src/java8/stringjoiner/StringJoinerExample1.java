package java8.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerExample1 {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(";");
        joiner.add("Myrzakanov");
        joiner.add("Daniyar");
        joiner.add("Usenovich");

        System.out.println(joiner);
    }
}
