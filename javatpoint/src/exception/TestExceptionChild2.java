package exception;

public class TestExceptionChild2 extends Parent {
    void msg() throws ArithmeticException {
        System.out.println("child");
    }

    public static void main(String[] args) {
        Parent parent = new TestExceptionChild2();
        parent.msg();
    }
}
