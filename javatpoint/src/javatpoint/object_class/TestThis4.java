package javatpoint.object_class;

class A4 {
    void m() {
        System.out.println("Hello m");
    }

    void n() {
        this.m();
    }
}

public class TestThis4 {
    public static void main(String[] args) {
        A4 a = new A4();
        a.n();
    }
}
