package javatpoint.object_class;

public class A12 {
    void m() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        A12 obj = new A12();
        System.out.println(obj);
        obj.m();
    }
}
