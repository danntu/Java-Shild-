package java8.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerExample3 {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        joiner.add("Myrzakanov");
        joiner.add("Daniyar");

        StringJoiner joiner2 = new StringJoiner(":", "[", "]");
        joiner2.add("Usenovich");
        joiner2.add("32");

        StringJoiner merge = joiner.merge(joiner2);
        System.out.println(merge);
    }
}
