import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by DMyrzaka on 11.07.2017.
 */
public class TextFieldDemo extends Applet implements ActionListener {
    TextField name,pass;

    @Override
    public void init() {
        super.init();
        Label namep= new Label("Name: ",Label.RIGHT);
        Label passp= new Label("Password: ",Label.RIGHT);
        name=new TextField(12);
        pass= new TextField(8);
        pass.setEchoChar('*');
        add(namep);add(name); add(passp); add(pass);

        name.addActionListener(this);
        pass.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Name: "+name.getText(),6,60);
        g.drawString("Selected text in name: "+name.getSelectedText(),6,80);

        g.drawString("Password: "+pass.getText(),6,100);
    }
}
