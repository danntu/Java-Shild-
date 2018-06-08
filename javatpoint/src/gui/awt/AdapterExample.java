package gui.awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by mdaniyar on 6/8/18.
 */
public class AdapterExample {
    public AdapterExample() {
        Frame frame = new Frame("Window Adapter");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new AdapterExample();
    }
}
