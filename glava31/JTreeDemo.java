package glava31;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class JTreeDemo extends JApplet {
    JTree jTree;
    JLabel jLabel;

    @Override
    public void init() {
        try{
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    makeGUI();
                }
            });
        }catch(Exception e){
            System.out.println("Can't create because of "+e);
        }
    }
    private void makeGUI(){
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Oprions");

        DefaultMutableTreeNode a  = new DefaultMutableTreeNode("thistest.A");
        top.add(a);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        a.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        a.add(a2);

        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        top.add(b);
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
        b.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
        b.add(b2);
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
        b.add(b3);
        jTree = new JTree(top);
        JScrollPane jsp = new JScrollPane(jTree);
        add(jsp);
        jLabel = new JLabel();
        add(jLabel, BorderLayout.SOUTH);
        jTree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                jLabel.setText("Selection is "+e.getPath());
            }
        });
    }
}
