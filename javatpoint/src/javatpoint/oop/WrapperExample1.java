package javatpoint.oop;

public class WrapperExample1 {
    public static void main(String[] args) {
        int a = 20;
        Integer i = Integer.valueOf(a); //convert int into Integer
        Integer j = a; //autoboxing
        System.out.println(a + " " + i + " " + j);
    }
}