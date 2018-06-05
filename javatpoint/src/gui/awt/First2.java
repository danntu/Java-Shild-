package gui.awt;

import java.awt.*;

/**
 * Created by mdaniyar on 6/5/18.
 */
public class First2 {
    public First2() {
        Frame frame = new Frame("First2");
        Button button = new Button("Click me");
        button.setBounds(30, 50, 80, 30);
        frame.add(button);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        First2 first2 = new First2();
    }
}
