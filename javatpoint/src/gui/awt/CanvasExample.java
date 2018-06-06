package gui.awt;

import java.awt.*;

/**
 * Created by mdaniyar on 6/6/18.
 */
class MyCanvas extends Canvas {
    public MyCanvas() {
        setBackground(Color.GRAY);
        setSize(300, 300);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(75, 75, 150, 150);
    }
}

public class CanvasExample {
    public CanvasExample() {
        Frame frame = new Frame("Canvas Example");
        frame.add(new MyCanvas());
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CanvasExample();
    }
}
