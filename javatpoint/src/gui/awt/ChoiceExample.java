package gui.awt;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by mdaniyar on 6/6/18.
 */
public class ChoiceExample extends Frame {
    public ChoiceExample() throws HeadlessException {
        Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400, 100);
        Choice choice = new Choice();
        choice.setBounds(200, 100, 75, 75);
        choice.add("C");
        choice.add("C++");
        choice.add("Java");
        choice.add("PHP");
        choice.add("Android");
        add(label);
        add(choice);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        choice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String data = "Programming language Selected: " + choice.getItem(choice.getSelectedIndex());
                label.setText(data);
            }
        });
    }

    public static void main(String[] args) {
        new ChoiceExample();
    }
}
