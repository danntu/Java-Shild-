package m_1.by.bsu.strings;

public class RefStringBuilder {
    public static void changeStr(StringBuilder s){
        s.append(" Certified");
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Java");
        changeStr(str);
        System.out.println(str);
    }
}
