package gui.awt;

import java.awt.*;

/**
 * Created by mdaniyar on 6/5/18.
 */
public class First extends Frame {
    public First() throws HeadlessException {
        Button button = new Button("Click me");
        button.setBounds(30, 100, 80, 30);
        add(button);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        First f = new First();
    }
}
