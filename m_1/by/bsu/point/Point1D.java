package m_1.by.bsu.point;

public class Point1D {
    private int x;

    public Point1D(int x) {
        thistest.x = x;
    }

    public double length(){
        return Math.abs(x);
    }

    @Override
    public String toString() {
        return " x = "+x;
    }
}
