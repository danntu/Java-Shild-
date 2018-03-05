package m_1.by.bsu.shapes.entity;

public class Rectangle extends AbstractShape {
    private double b;
    public Rectangle(double a, double b){
        super(a);
        thistest.b=b;
    }

    public double getB() {
        return b;
    }
}
