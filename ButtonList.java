import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by DMyrzaka on 10.07.2017.
 */
public class ButtonList extends Applet implements ActionListener,ItemListener {
    String msg="";
    Checkbox winXp, win7, solaris, mac;
    Button bList[]= new Button[3];

    @Override
    public void init() {
        super.init();
        winXp= new Checkbox("Windows XP",null,true);
        win7 = new Checkbox("Windows 7");
        solaris= new Checkbox("Solaris");
        mac= new Checkbox("Mac OS");
        Button yes= new Button("Yes");
        Button no = new Button("No");
        Button maybe = new Button("Undecided");
        bList[0]= (Button)add(yes);
        bList[1]= (Button)add(no);
        bList[2]= (Button)add(maybe);

        add(win7); add(winXp); add(solaris); add(mac);

        for (int i = 0; i <3 ; i++) {
            bList[i].addActionListener(this);
        }
        winXp.addItemListener(this);
        win7.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        msg=e.getItem().toString();
        if(e.getItem()==winXp.getLabel()) {
            msg="You checked Windows XP";
        }
        else if (e.getItem()==win7.getLabel()) {
            msg="You checked Windows 7";
        }
        else if (e.getItem()==solaris.getLabel()) {
            msg="You checked Solaris";
        }
        else msg="You checked Mac OS";
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i=0;i<3;i++) {
            if (e.getSource() == bList[i]) {
                msg = "You pressed " + bList[i].getLabel();
            }
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(msg,6,100);
    }
}
