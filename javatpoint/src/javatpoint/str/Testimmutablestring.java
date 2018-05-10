package javatpoint.str;

public class Testimmutablestring {
    public static void main(String[] args) {
        String s = "Danik";
        s.concat(" Myrzakanov");
        System.out.println(s);
    }
}

class Testimmutablestring1 {
    public static void main(String[] args) {
        String s = "Daniyar";
        s = s.concat(" Myrzakanov");
        System.out.println(s);
    }
}