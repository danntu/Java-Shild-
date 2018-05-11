package javatpoint.str;

public class StringBuilderExample3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.replace(4, 5, "Java");
        System.out.println(stringBuilder);
    }
}
