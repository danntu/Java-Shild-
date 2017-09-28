package glava31;

import javax.swing.*;

public class JTableDemo extends JApplet {
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
            System.out.println("Can't create of because "+e);
        }
    }

    private void makeGUI(){
        String[] colHeads = {"Name","Extension","ID#"};
        Object[][] data={
                {"Gail","4567","865"},
                {"Ken","5634","555"}
        };
        JTable jTable = new JTable(data,colHeads);
        JScrollPane jScrollPane = new JScrollPane(jTable);
        add(jScrollPane);
    }
}
