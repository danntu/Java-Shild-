package regex;

import java.util.regex.Pattern;

public class RegexExample5 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("..", "10"));
        System.out.println(Pattern.matches("\\d", "9"));
        System.out.println(Pattern.matches("\\d\\d", "99"));
        System.out.println(Pattern.matches("\\d+", "99"));
        System.out.println(Pattern.matches("\\d?", "5"));
        System.out.println(Pattern.matches("\\d*", "5454545"));

        System.out.println(Pattern.matches("\\D+", "Test"));
        System.out.println(Pattern.matches("[^0-9]+", "Test$%$"));

        System.out.println(Pattern.matches("[\\s]+", "  "));
        System.out.println(Pattern.matches("[\\S]+", "5656yg55543"));
        System.out.println(Pattern.matches("[^\\s]+", "ad87676"));
        System.out.println(Pattern.matches("[\\w]+", "ad87676"));
        System.out.println(Pattern.matches("[\\W]+", "$%#$#"));
    }
}
