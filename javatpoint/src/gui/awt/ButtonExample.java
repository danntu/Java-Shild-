package gui.awt;

import javax.xml.soap.Text;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mdaniyar on 6/5/18.
 */
public class ButtonExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Button Example");
        Button button = new Button("Click here");
        final TextField textField = new TextField();
        textField.setBounds(50, 50, 150, 20);
        button.setBounds(50, 100, 80, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Welcome to Javapoint");
            }
        });
        frame.add(button);
        frame.add(textField);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
