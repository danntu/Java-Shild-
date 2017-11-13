package m_1.by.bsu.strings;

public class RefString {
    public static  void chageStr(String str){
        str=str.concat("Certified");
    }
    public static void main(String[] args) {
        String str = new String("Java");
        chageStr(str);
        System.out.println(str);
    }
}
