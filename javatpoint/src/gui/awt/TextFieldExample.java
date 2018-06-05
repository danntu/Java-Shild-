package gui.awt;

import javax.xml.soap.Text;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * Created by mdaniyar on 6/5/18.
 */
public class TextFieldExample extends Frame implements ActionListener, TextListener {
    TextField textField1, textField2, textField3;
    Button buttonAdd, buttonSubstruction;

    public TextFieldExample() throws HeadlessException {
        textField1 = new TextField();
        textField1.setBounds(50, 50, 150, 20);
        textField1.addTextListener(this);

        textField2 = new TextField();
        textField2.setBounds(50, 100, 150, 20);
        textField2.addTextListener(this);

        textField3 = new TextField();
        textField3.setBounds(50, 150, 150, 20);
        textField3.setEditable(false);

        buttonAdd = new Button("+");
        buttonAdd.setBounds(50, 200, 50, 50);
        buttonAdd.addActionListener(this);

        buttonSubstruction = new Button("-");
        buttonSubstruction.setBounds(120, 200, 50, 50);
        buttonSubstruction.addActionListener(this);

        add(textField1);
        add(textField2);
        add(textField3);
        add(buttonAdd);
        add(buttonSubstruction);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //String number1 = textField1.getText();
        //String number2 = textField2.getText();
        int num1 = Integer.parseInt(textField1.getText());
        int num2 = Integer.parseInt(textField2.getText());
        int c = 0;
        if (e.getSource() == buttonAdd) {
            c = num1 + num2;
        } else if (e.getSource() == buttonSubstruction) {
            c = num1 - num2;
        }
        textField3.setText(String.valueOf(c));
    }

    @Override
    public void textValueChanged(TextEvent e) {
        if (e.getSource() == textField1) {
            textField3.setText(textField1.getText());
        } else {
            textField3.setText(textField2.getText());
        }
    }

    public static void main(String[] args) {
        new TextFieldExample();
    }
}
