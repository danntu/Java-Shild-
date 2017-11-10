package m_1.by.bsu.shapes.action;

import com.sun.org.apache.regexp.internal.RE;
import m_1.by.bsu.shapes.entity.AbstractShape;
import m_1.by.bsu.shapes.entity.Rectangle;

public class RectangleAction implements IShapeAction2<Rectangle> {
    @Override
    public double computeSquare(Rectangle shape) {
        return shape.getA()*shape.getB();
    }

    @Override
    public double computePerimeter(Rectangle shape) {
        return 2*(shape.getA()+shape.getB());
    }
}
