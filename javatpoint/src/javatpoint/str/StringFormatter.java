package javatpoint.str;

public class StringFormatter {
    public static String reverseStringBuilder(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static String reverseStringBuffer(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        return stringBuffer.toString();
    }

    public static String reverseStrinngIteration(String str) {
        char ch[] = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println("reverseStringBuilder");
        System.out.println(reverseStringBuilder("Danik"));

        System.out.println("reverseStringBuffer");
        System.out.println(reverseStringBuffer("Danik"));

        System.out.println("reverseStringIteration");
        System.out.println(reverseStrinngIteration("Danik"));
    }
}
