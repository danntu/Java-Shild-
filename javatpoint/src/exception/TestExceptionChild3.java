package exception;

class Parent3 {
    void msg() throws ArithmeticException {
        System.out.println("parent");
    }
}

public class TestExceptionChild3 extends Parent3 {
//    @Override
//    void msg() throws Exception {
//        System.out.println("child");
//    }

    public static void main(String[] args) {
        Parent3 parent3 = new TestExceptionChild3();
        parent3.msg();
    }
}
