package inner;

public class TestMemberOuter1 {
    private int data = 30;

    class Inner {
        void msg() {
            System.out.println("data is " + data);
        }
    }

    public static void main(String[] args) {
        TestMemberOuter1 outer1 = new TestMemberOuter1();
        TestMemberOuter1.Inner inner = outer1.new Inner();
        inner.msg();
    }
}
