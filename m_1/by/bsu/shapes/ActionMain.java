package m_1.by.bsu.shapes;

import m_1.by.bsu.shapes.action.IShapeAction;
import m_1.by.bsu.shapes.action.IShapeAction2;
import m_1.by.bsu.shapes.action.RectangleAction;
import m_1.by.bsu.shapes.action.TriangleAction;
import m_1.by.bsu.shapes.entity.Rectangle;
import m_1.by.bsu.shapes.entity.Triangle;

import static java.lang.Math.PI;

public class ActionMain {
    public static void main(String[] args) {
        IShapeAction action;
        try{
            Rectangle rectShape = new Rectangle(2,3);
            IShapeAction2<Rectangle> action1 = new RectangleAction();
            System.out.println("Square rectangle: "+action1.computeSquare(rectShape));
            System.out.println("Perimeter rectangle: "+action1.computePerimeter(rectShape));

            Triangle trShape = new Triangle(3,4,PI/6);
            IShapeAction2<Triangle> action2 = new TriangleAction();
            System.out.println("Square triangle: "+action2.computeSquare(trShape));
            System.out.println("Perimeter triangle: "+action2.computePerimeter(trShape));
            //action2.computePerimeter(rectShape);
        } catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
}
