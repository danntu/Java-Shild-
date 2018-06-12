package gui.awt;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by mdaniyar on 6/12/18.
 */
public class KeyAdapterExample {
    Label label;
    TextArea textArea;
    Frame frame;

    public KeyAdapterExample() {
        frame = new Frame("Key Adapter");
        label = new Label();
        label.setBounds(20, 50, 200, 20);
        textArea = new TextArea();
        textArea.setBounds(20, 80, 300, 300);
        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String text = textArea.getText();
                String words[] = text.split("\\s");
                label.setText("Words: " + words.length + " Characters:" + text.length());
            }
        });
        frame.add(label);
        frame.add(textArea);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new KeyAdapterExample();
    }
}
