package m_1.by.bsu.strings;

public class DemoStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("length->"+sb.length());
        System.out.println("size->"+sb.capacity());

        sb.append("Java");
        System.out.println("row->"+sb);
        System.out.println("length->"+sb.length());
        System.out.println("size->"+sb.capacity());

        sb.append("Internationalization");
        System.out.println("row->"+sb);
        System.out.println("length->"+sb.length());
        System.out.println("size->"+sb.capacity());

        System.out.println("Reverse -> "+sb.reverse());
    }
}
