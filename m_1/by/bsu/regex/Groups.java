package m_1.by.bsu.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    public static void main(String[] args) {
        String input = "abdcxyz";
        simpleMatches("([a-z]*)([a-z]+)",input);
        simpleMatches("([a-z]?)([a-z]+)",input);
        simpleMatches("([a-z]+)([a-z]*)",input);
        simpleMatches("([a-z]?)([a-z]?)",input);
    }
    public static void simpleMatches(String regex, String input){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()){
            System.out.println("First group "+matcher.group(1));
            System.out.println("Second group "+matcher.group(2)+"\n");
        } else{
            System.out.println("nothing\n");
        }
    }
}
