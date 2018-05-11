package javatpoint.str;

public class ConcatTest {
    public static String concatWithString() {
        String s = "Java";
        for (int i = 0; i < 100000; i++) {
            s = s + "Tpoint";
        }
        return s;
    }

    public static String concatWithStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer("Java");
        for (int i = 0; i < 100000; i++) {
            stringBuffer.append("Tpoint");
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        concatWithString();
        System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis() - startTime) + " ms");
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Time taken by Concating with StringBuffer: " + (System.currentTimeMillis() - startTime + " ms"));
    }
}
