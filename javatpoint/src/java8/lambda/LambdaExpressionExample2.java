package java8.lambda;

@FunctionalInterface
interface Drawable2 {
    void draw();
}

public class LambdaExpressionExample2 {
    public static void main(String[] args) {
        int width = 100;
        Drawable2 drawable2 = () -> {
            System.out.println("Drawing 2 = " + width);
        };
        drawable2.draw();
    }
}
