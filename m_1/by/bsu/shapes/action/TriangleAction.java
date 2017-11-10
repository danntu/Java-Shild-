package m_1.by.bsu.shapes.action;

import m_1.by.bsu.shapes.entity.AbstractShape;
import m_1.by.bsu.shapes.entity.Triangle;

public class TriangleAction implements IShapeAction2<Triangle>{
    @Override
    public double computeSquare(Triangle shape) {

        return 0.5*(shape.getA()*shape.getB());
    }

    @Override
    public double computePerimeter(Triangle shape) {
        return shape.getA()+shape.getB()+shape.getC();
    }
}
