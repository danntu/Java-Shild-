package javatpoint.str;

public class StringBufferExample6 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.capacity());
        stringBuffer.append("Hello");
        System.out.println(stringBuffer.capacity());
        stringBuffer.append("java is my favourite language");
        System.out.println(stringBuffer.capacity());
    }
}
