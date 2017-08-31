package glava28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr2 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("Java");
        Matcher mat= pat.matcher("Java 7");
        System.out.println("Поиск Java в Java7");
        if(mat.find())
            System.out.println("Подпоследовательность найдена");
        else
            System.out.println("Совпадений нет");
    }
}
