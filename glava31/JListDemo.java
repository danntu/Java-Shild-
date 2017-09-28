package glava31;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JListDemo extends JApplet {
    JList<String> jList;
    JLabel jLabel;
    JScrollPane jScrollPane;
    String Cities[] = {"New York","Chicogo","Houston",
                        "Denver","Los Angeles","Seattle",
                        "London","Paris","New Delhi",
                        "Hong Kong","Tokyo","Sydney" };

    @Override
    public void init() {
        try{
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    makeGUI();
                }
            });
        } catch (Exception e){
            System.out.println("Can't create because of "+e);
        }

    }

    private void makeGUI(){
        setLayout(new FlowLayout());
        jList = new JList<String>(Cities);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane = new JScrollPane(jList);
        jScrollPane.setPreferredSize(new Dimension(120,90));
        jLabel = new JLabel("Choose a City");
        jList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int idx = jList.getSelectedIndex();
                if(idx !=-1)
                    jLabel.setText("Current selecion: "+Cities[idx]);
                else
                    jLabel.setText("Choose a City");
            }
        });
        add(jScrollPane);
        add(jLabel);
    }
}
