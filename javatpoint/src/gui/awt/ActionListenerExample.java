package gui.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mdaniyar on 6/8/18.
 */
public class ActionListenerExample {
    public static void main(String[] args) {
        Frame frame = new Frame("ActionListener Example");
        final TextField textField = new TextField();
        textField.setBounds(50, 50, 150, 20);
        Button button = new Button("Click here");
        button.setBounds(50, 100, 60, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Welcome to Javatpoint");
            }
        });
        frame.add(button);
        frame.add(textField);
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
