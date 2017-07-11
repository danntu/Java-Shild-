import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by DMyrzaka on 11.07.2017.
 */
public class CardLayoutDemo extends Applet implements ActionListener,MouseListener {
    Checkbox winXP,win7,solaris,mac;
    Panel osCards;
    CardLayout cardLO;
    Button Win, Other;

    public void init(){
        Win = new Button("Windows");
        Other = new Button("Other");
        add(Win); add(Other);

        cardLO= new CardLayout();
        osCards= new Panel();
        osCards.setLayout(cardLO);

        winXP = new Checkbox("Windows XP",null,true);
        win7 = new Checkbox("Windows 7");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("Mac OS");

        Panel winPan = new Panel();
        winPan.add(winXP);
        winPan.add(win7);
        Panel otherPan = new Panel();
        otherPan.add(solaris);
        otherPan.add(mac);

        osCards.add(winPan,"Windows");
        osCards.add(otherPan,"Other");

        add(osCards);
        Win.addActionListener(this);
        Other.addActionListener(this);
        addMouseListener(this);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        cardLO.next(osCards);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Win){
            cardLO.show(osCards,"Windows");
        } else{
            cardLO.show(osCards,"Other");
        }
    }
}
