import java.applet.Applet;
import java.awt.event.*;

/**
 * Created by DMyrzaka on 05.07.2017.
 */
public class AnonymousInnerClassDemo extends Applet {
    @Override
    public void init() {
        super.init();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                super.mousePressed(e);
                showStatus("Mouse Pressed");
            }
        });
    }
}
