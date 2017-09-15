package glava31;

import javax.swing.*;

public class JLabelDemo extends JApplet{
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
        JLabel label = new JLabel("France", new ImageIcon("/home/mdaniyar/IdeaProjects/Java-Shild-/glava31/france.gif"),JLabel.CENTER);
        add(label);
    }
}
