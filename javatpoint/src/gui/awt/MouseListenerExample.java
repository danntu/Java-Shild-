package gui.awt;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by mdaniyar on 6/8/18.
 */
public class MouseListenerExample extends Frame implements MouseListener {
    Label label;

    public MouseListenerExample() throws HeadlessException {
        addMouseListener(this);
        label = new Label();
        label.setBounds(20, 50, 100, 20);
        add(label);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse exited");
    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}
