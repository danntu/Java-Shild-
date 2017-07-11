import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by DMyrzaka on 10.07.2017.
 */
public class ListDemo extends Applet implements ActionListener {
    List os, browser;
    String msg="";

    @Override
    public void init() {
        super.init();
        os = new List(4,true);
        browser= new List(4,false);
        os.add("Windows XP"); os.add("Windows 7"); os.add("Solaris"); os.add("Mac OS");
        browser.add("Internet Explorer"); browser.add("Firefox");
        browser.add("Opera"); browser.add("Google Chrome");
        add(os); add(browser);

        os.addActionListener(this);
        browser.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int idx[];
        msg="Current OS: ";
        idx=os.getSelectedIndexes();
        for (int i = 0; i <idx.length ; i++) {
            msg+=os.getItem(idx[i])+" ";
        }
        g.drawString(msg,6,120);

        msg="Current Browser: ";
        msg+=browser.getSelectedItem();
        g.drawString(msg,6,140);
    }
}
