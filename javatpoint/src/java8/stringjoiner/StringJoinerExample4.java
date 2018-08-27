package java8.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerExample4 {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",");
        System.out.println(joiner);

        joiner.setEmptyValue("It is empty");
        System.out.println(joiner);

        joiner.add("Myrzakanov");
        joiner.add("Daniyar");
        System.out.println(joiner);

        int length = joiner.length();
        System.out.println("Length : " + length);

        String str = joiner.toString();
        System.out.println(str);

        char ch = str.charAt(3);
        System.out.println("Character at index 3: " + ch);

        joiner.add("Usenovich");
        System.out.println(joiner);

        int newlength = joiner.length();
        System.out.println("New length: " + newlength);
    }
}
