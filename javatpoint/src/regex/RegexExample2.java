package regex;

import java.util.regex.Pattern;

public class RegexExample2 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".s", "as"));
        System.out.println(Pattern.matches(".s", "ak"));
        System.out.println(Pattern.matches(".s", "ats"));
        System.out.println(Pattern.matches(".s", "astor"));
        System.out.println(Pattern.matches("..s", "aes"));
    }
}
