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

class StringBufferExample3 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello ");
        stringBuffer.replace(1, 2, "a");
        System.out.println(stringBuffer);
    }
}

class StringBufferExample4 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Daniyar");
        stringBuffer.delete(3, 7);
        System.out.println(stringBuffer);
    }
}

class StringBufferExample5 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Danik");
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}