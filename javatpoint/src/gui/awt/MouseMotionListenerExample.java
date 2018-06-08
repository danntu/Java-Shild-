package gui.awt;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * Created by mdaniyar on 6/8/18.
 */
public class MouseMotionListenerExample extends Frame implements MouseMotionListener {
    Label label;
    public MouseMotionListenerExample() throws HeadlessException {
        addMouseMotionListener(this);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        label = new Label();
        label.setBounds(20, 40, 100, 20);
        add(label);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        label.setText("x= " + getX() + ", y=" + getY());
        Graphics graphics = getGraphics();
        graphics.setColor(Color.GREEN);
        graphics.fillOval(e.getX(), e.getY(), 20, 20);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        label.setText("x= " + e.getX() + ", " + e.getY());
    }

    public static void main(String[] args) {
        new MouseMotionListenerExample();
    }
}
