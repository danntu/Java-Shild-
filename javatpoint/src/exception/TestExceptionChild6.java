package exception;

class Parent6 {
    void msg() throws Exception {
        System.out.println("parent");
    }
}

public class TestExceptionChild6 extends Parent6 {
    void msg() {
        System.out.println("child");
    }

    public static void main(String[] args) {
        Parent6 parent6 = new TestExceptionChild6();
        try {
            parent6.msg();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
