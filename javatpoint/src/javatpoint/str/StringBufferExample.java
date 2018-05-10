package javatpoint.str;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello ");
        System.out.println("stringBuffer.capacity() " + stringBuffer.capacity());
        stringBuffer.append("World!");
        System.out.println(stringBuffer);
    }
}

class StringBufferExample2 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.insert(2, "World");
        System.out.println(stringBuffer);
    }
}
