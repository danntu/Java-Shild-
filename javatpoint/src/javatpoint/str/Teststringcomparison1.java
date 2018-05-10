package javatpoint.str;

public class Teststringcomparison1 {
    public static void main(String[] args) {
        String s1 = "Danik";
        String s2 = "Danik";
        String s3 = new String("Danik");
        String s4 = "Danik1";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}

class Teststringcomparison2 {
    public static void main(String[] args) {
        String s1 = "Danik";
        String s2 = "DANIK";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
