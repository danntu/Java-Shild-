package m_1.by.bsu.overload;

public class NumberInfo {
    public static void viewNum(Integer i){
        System.out.printf("Integer = %d%n",i);
    }
    public static void  viewNum(int i){
        System.out.printf("int = %d%n",i);
    }

    public static  void viewNum(Float f){
        System.out.printf("Float = %.4f%n",f);
    }
    public static  void viewNum(Number n){
        System.out.println("Number = "+n);
    }

    public static void main(String[] args) {
        Number num[] = {new Integer(7),71,3.14f,7.2};
        for (Number n : num){
            viewNum(n);
        }
        viewNum(new Integer(8));
        viewNum(81);
        viewNum(4.14f);
        viewNum(8.2);
    }
}
