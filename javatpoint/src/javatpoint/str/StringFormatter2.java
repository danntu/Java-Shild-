package javatpoint.str;

public class StringFormatter2 {
    public static String reverseWord(String str) {
        String words[] = str.split("\\s");
        String reverseWord = "";
        for (String w :
                words) {
            StringBuilder stringBuilder = new StringBuilder(w);
            stringBuilder.reverse();
            reverseWord += stringBuilder.toString() + " ";
        }
        return reverseWord;
    }

    public static void main(String[] args) {
        System.out.println(reverseWord("My name is Daniyar"));
    }
}
