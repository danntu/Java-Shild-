package gui.awt;

import java.awt.*;

/**
 * Created by mdaniyar on 6/7/18.
 */
public class PanelExample {
    public PanelExample() {
        Frame frame = new Frame("Panel Example");
        Panel panel = new Panel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(Color.GRAY);
        Button button1 = new Button("Button1");
        button1.setBounds(50, 100, 80, 30);
        button1.setBackground(Color.YELLOW);

        Button button2 = new Button("Button2");
        button2.setBounds(100, 100, 80, 30);
        button2.setBackground(Color.GREEN);
        panel.add(button1);
        panel.add(button2);
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new PanelExample();
    }
}
