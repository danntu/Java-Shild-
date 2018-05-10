package javatpoint.str;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Danik";
        System.out.println(s.toUpperCase()); //DANIK
        System.out.println(s.toLowerCase()); //danik
        System.out.println(s); //Danik (no change in original)

        s = " Danik ";
        System.out.println(s.trim());
        System.out.println(s);

        System.out.println(s.startsWith(" Da"));
        System.out.println(s.endsWith("ik "));

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));

        System.out.println(s.length());

        String s1 = new String("Danik");
        String s2 = s1.intern();
        System.out.println(s2.equals(s1));
        int a = 10;

        String s3 = String.valueOf(a);
        System.out.println(s3 + 10);

        String s4 = "Java is a programming language. Java is a platform. Java is an Island.";
        System.out.println(s4.replace("Java", "Kotlin"));
    }
}
