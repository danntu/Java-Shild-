package javatpoint.inter;

interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("drawing circle");
    }
}

public class TestInterface1 {
    public static void main(String[] args) {
        Drawable drawable = new Circle();
        drawable.draw();

        drawable = new Rectangle();
        drawable.draw();
    }
}
