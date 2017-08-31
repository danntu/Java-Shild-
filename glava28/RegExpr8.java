package glava28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr8 {
    public static void main(String[] args) {
        String str= "Jon Jonathan Fran Ken Todd";
        Pattern pat = Pattern.compile("Jon.*? ");
        Matcher mat = pat.matcher(str);
        System.out.println("Начальная последовательность: "+str);
        str=mat.replaceAll("Eric ");
        System.out.println("Изменнная последовательность: "+str);
    }
}
