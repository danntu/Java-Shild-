package inner;

public class TestOuter2 {
    static int data = 30;

    static class Inner2 {
        static void msg() {
            System.out.println("data is " + data);
        }
    }

    public static void main(String[] args) {
        TestOuter2.Inner2.msg();
    }
}
