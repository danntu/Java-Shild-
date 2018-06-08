package gui.awt;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by mdaniyar on 6/8/18.
 */
public class KeyListenerExample extends Frame implements KeyListener {
    Label label;
    TextArea textArea;

    public KeyListenerExample() throws HeadlessException {
        label = new Label();
        label.setBounds(20, 50, 300, 20);
        textArea = new TextArea();
        textArea.setBounds(20, 80, 300, 300);
        textArea.addKeyListener(this);
        add(label);
        add(textArea);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        label.setText("Key typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        label.setText("Key pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        String text = textArea.getText();
        String words[] = text.split("\\s");
        label.setText("Words: " + words.length + " Characters: " + text.length());
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
