package gui.awt;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * Created by mdaniyar on 6/8/18.
 */
public class MouseMotionListenerExample extends Frame implements MouseMotionListener {
    public MouseMotionListenerExample() throws HeadlessException {
        addMouseMotionListener(this);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics graphics = getGraphics();
        graphics.setColor(Color.GREEN);
        graphics.fillOval(e.getX(), e.getY(), 20, 20);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public static void main(String[] args) {
        new MouseMotionListenerExample();
    }
}
