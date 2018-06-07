package gui.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mdaniyar on 6/7/18.
 */
public class DialogExample {
    private static Dialog dialog;

    public DialogExample() {
        Frame frame = new Frame();
        dialog = new Dialog(frame, "Dialog Example", true);
        dialog.setLayout(new FlowLayout());
        Button button = new Button("OK");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DialogExample.dialog.setVisible(false);
            }
        });
        dialog.add(new Label("Click button to continue."));
        dialog.add(button);
        dialog.setSize(300, 300);
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        new DialogExample();
    }
}
