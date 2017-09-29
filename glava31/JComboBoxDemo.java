package glava31;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxDemo extends JApplet {
    JLabel jLabel;
    ImageIcon france, germany, italy, japan;
    JComboBox<String> jComboBox;
    String falgs[]={"france","germany","italy","japan"};

    @Override
    public void init() {
        try{
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    makeGUI();
                }
            });
        } catch(Exception e){
            System.out.println("Can't create because of "+e);
        }

    }
    private void makeGUI(){
        setLayout(new FlowLayout());
        jComboBox = new JComboBox<String>(falgs);
        add(jComboBox);

        jComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = (String)jComboBox.getSelectedItem();
                jLabel.setText(s);
                jLabel.setIcon(new ImageIcon("/home/mdaniyar/IdeaProjects/Java-Shild-/glava31/"+s+".gif"));
            }
        });
        jLabel=new JLabel(new ImageIcon("/home/mdaniyar/IdeaProjects/Java-Shild-/glava31/france.gif"));
        add(jLabel);

    }
}
