package gui.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mdaniyar on 7/4/18.
 */
public class TextAreaExample {
    public TextAreaExample() {
        JFrame f = new JFrame();
        JLabel labelWords = new JLabel();
        labelWords.setBounds(50, 25, 200, 30);

        JLabel labelCharacters = new JLabel();
        labelCharacters.setBounds(160, 25, 200, 30);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(20, 75, 250, 200);

        JButton countButton = new JButton("Count words");
        countButton.setBounds(100, 300, 200, 30);

        countButton.addActionListener(e -> {
            labelWords.setText("Words : " + textArea.getText().split("\\s").length);
            labelCharacters.setText("Characters : " + textArea.getText().length());
        });

        f.add(labelWords);
        f.add(labelCharacters);
        f.add(textArea);
        f.add(countButton);
        f.setSize(450, 450);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TextAreaExample();
    }
}
