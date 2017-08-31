package glava28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr {
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;
        pat=Pattern.compile("Java");
        mat=pat.matcher("Java");
        found=mat.matches();
        System.out.println("Проверка совпадения Java с Java");
        if(found)
            System.out.println("Совпадает");
        else
            System.out.println("Не совпадает");

        System.out.println();

        System.out.println("Проверка совпадения Java с Java 7");
        mat=pat.matcher("Java 7");
        found=mat.matches();
        if(found)
            System.out.println("Совпадает");
        else
            System.out.println("Не совпадает");

    }
}
