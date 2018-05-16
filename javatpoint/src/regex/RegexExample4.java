package regex;

import java.util.regex.Pattern;

public class RegexExample4 {
    public static void main(String[] args) {
        System.out.println("? quantifier ....");
        System.out.println(Pattern.matches("[fgd]?", "d"));
        System.out.println(Pattern.matches("[hjt]?", "zd"));
        System.out.println(Pattern.matches("[kljt]", "kl"));

        System.out.println("+ quantifier ....");
        System.out.println(Pattern.matches("[fdg]+", "d"));
        System.out.println(Pattern.matches("[fdg]+", "dfg"));
        System.out.println(Pattern.matches("[fdg]+", "dfgfffgggggd"));
        System.out.println(Pattern.matches("[fdg]+", "zdg"));

        System.out.println("* quantifier ....");
        System.out.println(Pattern.matches("[asd]*", "fsd"));

        System.out.println("X{n}");
        System.out.println(Pattern.matches("[abs]{3}", "bas"));
        System.out.println(Pattern.matches("[abs]{2}", "bs"));
        System.out.println(Pattern.matches("[abs]{2,}", "bsasb"));
    }
}
