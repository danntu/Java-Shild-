package java8.lambda;

interface Drawable {
    void draw();
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        int width = 100;

        Drawable drawable = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        drawable.draw();
    }
}
