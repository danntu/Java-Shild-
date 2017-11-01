package m_1.by.bsu.creator;

import m_1.by.bsu.point.Point2D;

public class Runner {
    public static void main(String[] args) {
        Point2DCreator br = new Point3DCreator();
        Point2D p = br.createPoint();
        System.out.println(br.createPoint());
        System.out.println(br.createPoint());
    }
}
