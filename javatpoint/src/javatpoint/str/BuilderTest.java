package javatpoint.str;

public class BuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("hello");
        stringBuilder.append(" java");
        System.out.println(stringBuilder.toString());
    }
}
