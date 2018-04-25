package javatpoint.object_class;

class A5 {
    A5() {
        System.out.println("Hello A");
    }

    A5(int x) {
        this();
        System.out.println(x);
    }
}

public class TestThis5 {
    public static void main(String[] args) {
        A5 a = new A5(10);
    }
}
