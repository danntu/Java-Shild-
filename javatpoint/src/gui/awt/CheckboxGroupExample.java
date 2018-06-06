package gui.awt;

import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by mdaniyar on 6/6/18.
 */
public class CheckboxGroupExample implements ItemListener {
    CheckboxGroup checkboxGroup;
    Checkbox checkbox1;
    Checkbox checkbox2;
    Label label;

    public CheckboxGroupExample() {
        Frame frame = new Frame("CheckboxGroup Example");
        label = new Label("Text");
        label.setAlignment(Label.CENTER);
        label.setSize(400, 100);
        CheckboxGroup checkboxGroup = new CheckboxGroup();
        Checkbox checkbox1 = new Checkbox("C++", checkboxGroup, false);
        checkbox1.setBounds(100, 100, 50, 50);
        Checkbox checkbox2 = new Checkbox("Java", checkboxGroup, false);
        checkbox2.setBounds(100, 150, 50, 50);
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(label);
        checkboxGroup.getSelectedCheckbox();
        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getItem().toString() == "C++") {
            label.setText("C++ checkbox: Checked");
        } else if (e.getItem().toString() == "Java") {
            label.setText("Java checkbox: Checked");
        }
    }

    public static void main(String[] args) {
        new CheckboxGroupExample();
    }
}
