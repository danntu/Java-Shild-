package gui.awt;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/**
 * Created by mdaniyar on 6/6/18.
 */
public class ScrollbarExample extends Frame {
    public ScrollbarExample() {
        super("Scrollbar Example");
        Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400, 100);
        Scrollbar scrollbar = new Scrollbar();
        scrollbar.setBounds(100, 100, 50, 300);
        add(label);
        add(scrollbar);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        scrollbar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Vertical Scrollbar value is: " + scrollbar.getValue());
            }
        });
    }

    public static void main(String[] args) {
        new ScrollbarExample();
    }
}
