package javatpoint.str;

public class StringFormatter4 {
    public static String reverseToggle(String str) {
        String words[] = str.split("\\s");
        String reverseToggle = "";
        for (String w :
                words) {
            StringBuilder stringBuilder = new StringBuilder(w);
            stringBuilder.reverse();
            String first = stringBuilder.substring(0, 1);
            String afterfirst = stringBuilder.substring(1);
            reverseToggle += first.toLowerCase() + afterfirst.toUpperCase() + " ";
        }
        return reverseToggle;
    }

    public static void main(String[] args) {
        System.out.println(reverseToggle("My name is Daniyar"));
    }
}
