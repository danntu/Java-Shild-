package gui.awt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mdaniyar on 6/5/18.
 */
public class Outer implements ActionListener {
    AEvent2 oAEvent2;

    public Outer(AEvent2 oAEvent2) {
        this.oAEvent2 = oAEvent2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        oAEvent2.textField.setText("Hello form another class");
    }
}
