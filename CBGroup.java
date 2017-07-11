import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by DMyrzaka on 10.07.2017.
 */
public class CBGroup extends Applet implements ItemListener {
    String msg="";
    Checkbox winXp, win7, solaris, mac;
    CheckboxGroup cbg;

    @Override
    public void init() {
        super.init();
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        cbg= new CheckboxGroup();
        winXp= new Checkbox("Windows XP",cbg,true);
        win7 = new Checkbox("Windows 7",cbg,false);
        solaris= new Checkbox("Solaris",cbg,false);
        mac= new Checkbox("Mac OS",cbg,false);

        add(winXp); add(win7); add(solaris); add(mac);
        winXp.addItemListener(this);
        win7.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }
    public void paint(Graphics g){
        msg="Current selection: ";
        msg+=cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg,6,100);
    }
}
