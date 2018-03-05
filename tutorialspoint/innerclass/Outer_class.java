package innerclass;

abstract class AnonymousInner {
    public abstract void mymethod();
}

public class Outer_class {
    public static void main(String[] args) {
        AnonymousInner inner = new AnonymousInner() {
            @Override
            public void mymethod() {
                System.out.println("This is an example of anonymous inner class");
            }
        };
        inner.mymethod();
    }
}
