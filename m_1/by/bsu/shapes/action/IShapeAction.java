package m_1.by.bsu.shapes.action;

import m_1.by.bsu.shapes.entity.AbstractShape;

public interface IShapeAction extends ILineGroupAction {
    double computeSquare(AbstractShape shape);
}
