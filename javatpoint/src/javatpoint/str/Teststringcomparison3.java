package javatpoint.str;

public class Teststringcomparison3 {
    public static void main(String[] args) {
        String s1 = "Danik";
        String s2 = "Danik";
        String s3 = new String("Danik");
        System.out.println(s1 == s2);//true (because both refer to same instance)
        System.out.println(s1 == s3); //false(because s3 refers to instance created in nonpool)
    }
}
