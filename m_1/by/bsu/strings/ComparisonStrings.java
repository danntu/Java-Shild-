package m_1.by.bsu.strings;

public class ComparisonStrings {
    public static void main(String[] args) {
        String s1,s2;
        s1="Java";
        s2=s1;
        System.out.println("сравнение ссылок "+(s1==s2));
        s2 = new String("Java");
        System.out.println("сравнение ссылок "+(s1==s2));
        System.out.println("сравнение значений "+s1.equals(s2));
    }
}
