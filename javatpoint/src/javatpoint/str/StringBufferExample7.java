package javatpoint.str;

public class StringBufferExample7 {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.capacity());
        stringBuffer.append("Hello");
        System.out.println(stringBuffer.capacity());
        stringBuffer.append("java is my favourite language");
        System.out.println(stringBuffer.capacity());
        stringBuffer.ensureCapacity(10);
        System.out.println(stringBuffer.capacity());
        stringBuffer.ensureCapacity(50);
        System.out.println(stringBuffer.capacity());
    }
}
