package javatpoint.str;

public class StringBuilderExample2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello ");
        stringBuilder.insert(5, ", Java");
        System.out.println(stringBuilder);
    }
}
