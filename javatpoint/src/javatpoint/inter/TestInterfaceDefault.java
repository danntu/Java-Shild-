package javatpoint.inter;

interface Drawable6 {
    void draw();

    default void message() {
        System.out.println("default message");
    }
}

class Rectangle6 implements Drawable6 {
    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

public class TestInterfaceDefault {
    public static void main(String[] args) {
        Drawable6 drawable6 = new Rectangle6();
        drawable6.draw();
        drawable6.message();
    }
}
