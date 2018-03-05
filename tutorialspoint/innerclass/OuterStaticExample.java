package innerclass;

public class OuterStaticExample {
    static class NestedDemo {
        public void my_method() {
            System.out.println("This is my nested static class");
        }
    }

    public static void main(String[] args) {
        OuterStaticExample.NestedDemo demo = new OuterStaticExample.NestedDemo();
        demo.my_method();
    }
}
