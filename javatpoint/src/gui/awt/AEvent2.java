package gui.awt;

import java.awt.*;

/**
 * Created by mdaniyar on 6/5/18.
 */
public class AEvent2 extends Frame {
    TextField textField;
    Button button;

    AEvent2() {
        textField = new TextField();
        textField.setBounds(60, 50, 170, 20);
        button = new Button("click me");
        button.setBounds(100, 120, 80, 30);
        Outer o = new Outer(this);
        button.addActionListener(o);
        add(button);
        add(textField);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AEvent2();
    }
}
