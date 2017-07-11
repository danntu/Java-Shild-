import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by DMyrzaka on 10.07.2017.
 */
public class ChoiceDemo extends Applet implements ItemListener {

    Choice os, browser;
    String msg="";

    @Override
    public void init() {
        super.init();
        os = new Choice();
        browser = new Choice();

        os.add("Windows XP"); os.add("Windows 7"); os.add("Solaris"); os.add("Mac OS");
        browser.add("Internet Explorer"); browser.add("Firefox");
        browser.add("Opera"); browser.add("Google Chrome");
        add(os); add(browser);

        os.addItemListener(this);
        browser.addItemListener(this);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        msg="Current OS: ";
        msg+=os.getSelectedItem();
        g.drawString(msg,6,120);
        msg="Current Browser: ";
        msg+=browser.getSelectedItem();
        g.drawString(msg,6,140);
    }
}
