package javatpoint.str;

public class Teststringcomparison4 {
    public static void main(String[] args) {
        String s1 = "Danik";
        String s2 = "Danik";
        String s3 = "Dani";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));
    }
}
