package gui.awt;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * Created by mdaniyar on 6/12/18.
 */
public class MouseMotionAdapterExample {
    Frame frame;

    public MouseMotionAdapterExample() throws HeadlessException {
        frame = new Frame("Mouse Motion Adpater");
        frame.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Graphics g = frame.getGraphics();
                g.setColor(Color.ORANGE);
                g.fillOval(e.getX(), e.getY(), 20, 20);
            }
        });
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MouseMotionAdapterExample();
    }
}
