package javatpoint.access.pack;

public class A {
    protected void msg() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.msg();
    }
}
