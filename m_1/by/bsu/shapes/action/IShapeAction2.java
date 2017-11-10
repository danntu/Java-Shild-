package m_1.by.bsu.shapes.action;

import m_1.by.bsu.shapes.entity.AbstractShape;

public interface IShapeAction2 <T extends AbstractShape> {
    double computeSquare(T shape);
    double computePerimeter(T shape);
}
