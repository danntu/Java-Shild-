package javatpoint.inter;

interface Drawable7 {
    void draw();

    static int cube(int x) {
        return x * x * x;
    }
}

class Rectangle7 implements Drawable7 {
    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

public class TestInterfaceStatic {
    public static void main(String[] args) {
        Drawable7 drawable7 = new Rectangle7();
        drawable7.draw();
        System.out.println(Drawable7.cube(3));
    }
}
