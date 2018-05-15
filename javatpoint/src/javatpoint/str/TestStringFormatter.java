package javatpoint.str;

public class TestStringFormatter {
    public static String capitalizeWord(String str) {
        String words[] = str.split("\\s");
        String capitalizeWord = "";
        for (String w :
                words) {
            String firtst = w.substring(0, 1);
            String afterfirst = w.substring(1);
            capitalizeWord += firtst.toUpperCase() + afterfirst + " ";
        }
        return capitalizeWord;
    }

    public static void main(String[] args) {
        System.out.println(capitalizeWord("my name is daniyar"));
    }
}
