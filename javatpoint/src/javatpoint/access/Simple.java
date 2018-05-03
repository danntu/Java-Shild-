package javatpoint.access;

class A {
    private int data = 40;

    private void msg() {
        System.out.println("Hello java");
    }
}

public class Simple {
    public static void main(String[] args) {
        A ob = new A();
        System.out.println(ob.data); //compile time error
        obj.msg(); //compile time error
    }
}
