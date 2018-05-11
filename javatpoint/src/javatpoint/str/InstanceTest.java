package javatpoint.str;

public class InstanceTest {
    public static void main(String[] args) {
        System.out.println("Hashcode test of String: ");
        System.out.println("java".hashCode());
        System.out.println(("java" + "tpoint").hashCode());

        System.out.println("Hashcode test of StringBuffer");
        StringBuffer stringBuffer = new StringBuffer("java");
        System.out.println(stringBuffer.hashCode());
        System.out.println(stringBuffer.append("tpoint").hashCode());
    }
}
