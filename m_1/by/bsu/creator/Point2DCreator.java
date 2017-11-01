package m_1.by.bsu.creator;

import m_1.by.bsu.point.Point1D;
import m_1.by.bsu.point.Point2D;

public class Point2DCreator extends Point1DCreator {
    @Override
    public Point2D createPoint() {
        System.out.println("Point2D");
        return new Point2D(2,5);
    }
}
