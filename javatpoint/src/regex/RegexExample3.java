package regex;

import java.util.regex.Pattern;

public class RegexExample3 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[ftg]", "ftg"));
        System.out.println(Pattern.matches("[hsdty]", "t"));
        System.out.println(Pattern.matches("[^dft]", "z"));
        System.out.println(Pattern.matches("[a-z]", "x"));
        System.out.println(Pattern.matches("[A-Z]", "Y"));
        System.out.println(Pattern.matches("[a-zA-Z]", "T"));
        System.out.println(Pattern.matches("[0-9]", "7"));
        // union
        System.out.println(Pattern.matches("[a-f[k-p]]", "l"));
        System.out.println(Pattern.matches("[a-f[k-p]]", "b"));
        // intersection
        System.out.println(Pattern.matches("[a-z&&[def]]", "y"));
        System.out.println(Pattern.matches("[a-z&&[def]]", "f"));
        // substruction
        System.out.println(Pattern.matches("[a-z&&[^bc]]", "c"));
        System.out.println(Pattern.matches("[ad-z]", "f"));
        System.out.println(Pattern.matches("[a-z&&[^m-p]]", "y"));
        System.out.println(Pattern.matches("[a-lq-z]", "n"));
    }
}
