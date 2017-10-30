package m_1.by.bsu.enums;

public class ShapeRunner {
    public static void main(String[] args) {
        double x =2, y =3;
        Shape sh;
        sh = Shape.RECTANGLE;
        System.out.printf("%10s = %5.2f%n",sh,sh.defineSquare(x,y));
        sh = Shape.TRIANGLE;
        System.out.printf("%10s = %5.2f%n",sh,sh.defineSquare(x,y));
        sh =Shape.CIRCLE;
        System.out.printf("%10s = %5.2f%n",sh,sh.defineSquare(x,y));
    }
}
