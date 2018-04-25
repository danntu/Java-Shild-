package javatpoint.object_class;

class A11 {
    A11 getA() {
        return this;
    }

    void msg() {
        System.out.println("Hello java");
    }
}

public class Test11 {
    public static void main(String[] args) {
        A11 a = new A11().getA();
        a.msg();
    }
}
