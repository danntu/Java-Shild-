package gui.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mdaniyar on 6/5/18.
 */
public class AEvent extends Frame {
    TextField textField;

    public AEvent() throws HeadlessException {
        textField = new TextField();
        textField.setBounds(60, 50, 170, 20);
        Button button = new Button("click me");
        button.setBounds(100, 120, 80, 30);
        button.addActionListener(e -> {
            textField.setText("Hello World");
        });
        add(button);
        add(textField);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        textField.setText("Hello World");
    }

    public static void main(String[] args) {
        new AEvent();
    }
}
