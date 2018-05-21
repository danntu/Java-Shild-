package exception;

class Parent5 {
    void msg() throws Exception {
        System.out.println("parent");
    }
}

public class TestExceptionChild5 extends Parent5 {
    void msg() throws ArithmeticException {
        System.out.println("child");
    }

    public static void main(String[] args) {
        Parent5 parent5 = new TestExceptionChild5();
        try {
            parent5.msg();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
