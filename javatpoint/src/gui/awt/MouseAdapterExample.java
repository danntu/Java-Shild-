package gui.awt;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by mdaniyar on 6/8/18.
 */
public class MouseAdapterExample extends Frame {
    public MouseAdapterExample() throws HeadlessException {
        super("Mouse Adapted");
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Graphics graphics = getGraphics();
                graphics.setColor(Color.BLUE);
                graphics.fillOval(e.getX(), e.getY(), 30, 30);
            }
        });
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseAdapterExample();
    }
}
