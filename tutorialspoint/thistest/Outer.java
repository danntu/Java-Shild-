package thistest;

abstract class Inner {
    abstract public void show();
}

public class Outer {


    public static void main(String[] args) {

        Inner inner = new Inner() {
            @Override
            public void show() {
                System.out.println("anonymous inner class");
            }
        };
        inner.show();
    }
}
