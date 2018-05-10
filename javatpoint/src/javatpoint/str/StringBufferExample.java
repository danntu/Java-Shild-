package javatpoint.str;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello ");
        System.out.println("stringBuffer.capacity() " + stringBuffer.capacity());
        stringBuffer.append("World!");
        System.out.println(stringBuffer);
    }
}
