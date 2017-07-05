import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

/**
 * Created by DMyrzaka on 05.07.2017.
 */
public class MouseEvent extends Applet implements MouseListener,MouseMotionListener,MouseWheelListener{
    String msg="";
    int mouseX=0, mouseY=0;
    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
        addMouseWheelListener(this);
    }


    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        mouseX=0;
        mouseY=10;
        msg="Mouse clicked";
        repaint();
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        mouseX=0;
        mouseY=10;
        msg="Mouse entered";
        repaint();
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        mouseX=0;
        mouseY=10;
        msg="Mouse exited";
        repaint();
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        mouseX=e.getX();
        mouseY=e.getY();
        msg="Down";
        repaint();
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        mouseX=e.getX();
        mouseY=e.getY();
        msg="Up";
        repaint();
    }

    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {
        showStatus("Moving mouse at "+e.getX()+","+e.getY());
    }

    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {
        mouseX=e.getX();
        mouseY=e.getY();
        msg="*";
        showStatus("Dragging mouse at "+mouseX+","+mouseY);
        repaint();
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        mouseX=e.getX();
        mouseY=e.getY();
        msg="Mouse wheeled";
        repaint();
    }

    public void paint(Graphics g){
        g.drawString(msg,mouseX,mouseY);
    }
}
