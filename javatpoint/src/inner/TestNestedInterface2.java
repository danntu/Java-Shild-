package inner;

class A {
    interface Message {
        void msg();
    }
}

public class TestNestedInterface2 implements A.Message {
    @Override
    public void msg() {
        System.out.println("Hello nested interface");
    }

    public static void main(String[] args) {
        A.Message message = new TestNestedInterface2();
        message.msg();
    }
}
