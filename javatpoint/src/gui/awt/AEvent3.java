package gui.awt;

import javatpoint.object_class.TestThis4;

import javax.xml.soap.Text;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mdaniyar on 6/5/18.
 */
public class AEvent3 extends Frame {
    TextField textField;
    Button button;

    public AEvent3() throws HeadlessException {
        textField = new TextField();
        textField.setBounds(60, 50, 170, 20);
        button = new Button("click me");
        button.setBounds(50, 120, 80, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("From anonymous class");
            }
        });
        add(button);
        add(textField);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AEvent3();
    }
}
