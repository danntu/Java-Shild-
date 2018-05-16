package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {
    public static void main(String[] args) {
        // 1 way
        Pattern pattern = Pattern.compile(".s");
        Matcher matcher = pattern.matcher("as");
        boolean b = matcher.matches();
        // 2 way
        boolean b2 = Pattern.compile(".s").matcher("as").matches();
        // 3 way
        boolean b3 = Pattern.matches(".s", "as");

        System.out.println(b + " " + b2 + " " + b3);
    }
}
