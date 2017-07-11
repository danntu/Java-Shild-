import java.applet.Applet;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * Created by DMyrzaka on 11.07.2017.
 */
/*
<applet code ="SBDemo" width=300 height=200>
 */
public class SBDemo extends Applet implements AdjustmentListener,MouseMotionListener {
    String msg="";
    Scrollbar vertSB, horzSB;

    @Override
    public void init() {
        super.init();
        int width=Integer.parseInt(getParameter("width"));
        int height=Integer.parseInt(getParameter("height"));
        vertSB = new Scrollbar(Scrollbar.VERTICAL,0,1,0,height);
        vertSB.setPreferredSize(new Dimension(20,100));

        horzSB= new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,width);
        horzSB.setPreferredSize(new Dimension(100,20));
        add(vertSB); add(horzSB);

        vertSB.addAdjustmentListener(this);
        horzSB.addAdjustmentListener(this);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int x= e.getX(); int y=e.getY();
        vertSB.setValue(y);
        horzSB.setValue(x);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        msg="Vertical: "+vertSB.getValue();
        msg+=", Horizontal: "+horzSB.getValue();
        g.drawString(msg,6,160);
        g.drawString("*",horzSB.getValue(),vertSB.getValue());
    }
}
