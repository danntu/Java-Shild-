package glava33;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class MaxWD extends JApplet implements ActionListener {
    JTextField maxWDtext,orgPText,periodText,rateText,numWDText;
    JButton doIt;

    double principal;
    double rateofRet;
    double numYears;
    int    numPerYear;

    NumberFormat nf;

    public void init(){
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
        GridBagLayout gbag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbag);

        JLabel heading = new JLabel("Maximum Regular Withdrawals");
        JLabel orgPLab = new JLabel("Original Principal");
        JLabel periodLab = new JLabel("Years");
        JLabel rateLab = new JLabel("Rate of Return");
        JLabel numWDLab = new JLabel("Number of Withdrawals per Year");
        JLabel maxWDLab = new JLabel("Maximum Withdrawal");

        maxWDtext = new JTextField(10);
        periodText = new JTextField(10);
        orgPText = new JTextField(10);
        rateText = new JTextField(10);
        numWDText = new JTextField(10);

        maxWDtext.setEditable(false);
        doIt = new JButton("Compute");

        gbc.weighty=1.0;
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;
        gbag.setConstraints(heading,gbc);

        gbc.anchor=GridBagConstraints.EAST;

        gbc.gridwidth =GridBagConstraints.RELATIVE;
        gbag.setConstraints(orgPLab,gbc);
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbag.setConstraints(orgPText,gbc);

        gbc.gridwidth =GridBagConstraints.RELATIVE;
        gbag.setConstraints(periodLab,gbc);
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbag.setConstraints(periodText,gbc);

        gbc.gridwidth =GridBagConstraints.RELATIVE;
        gbag.setConstraints(rateLab,gbc);
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbag.setConstraints(rateText,gbc);

        gbc.gridwidth =GridBagConstraints.RELATIVE;
        gbag.setConstraints(numWDLab,gbc);
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbag.setConstraints(numWDText,gbc);

        gbc.gridwidth =GridBagConstraints.RELATIVE;
        gbag.setConstraints(maxWDLab,gbc);
        gbc.gridwidth =GridBagConstraints.REMAINDER;
        gbag.setConstraints(maxWDtext,gbc);

        gbc.anchor=GridBagConstraints.CENTER;
        gbag.setConstraints(doIt,gbc);

        add(heading);
        add(orgPLab);
        add(orgPText);
        add(periodLab);
        add(periodText);
        add(rateLab);
        add(rateText);
        add(numWDLab);
        add(numWDText);
        add(maxWDLab);
        add(maxWDtext);
        add(doIt);
        orgPText.addActionListener(thistest);
        periodText.addActionListener(thistest);
        rateText.addActionListener(thistest);
        numWDText.addActionListener(thistest);
        doIt.addActionListener(thistest);

        nf= NumberFormat.getInstance();
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        double result=0.0;
        String orgPstr = orgPText.getText();
        String periodStr = periodText.getText();
        String rateStr =  rateText.getText();
        String numWDStr =  numWDText.getText();

        try{
            if(orgPstr.length() !=0 &&
                    periodStr.length() !=0 &&
                    rateStr.length() !=0 &&
                    numWDStr.length() !=0){
                principal = Double.parseDouble(orgPstr);
                numYears = Double.parseDouble(periodStr);
                rateofRet = Double.parseDouble(rateStr)/100;
                numPerYear=Integer.parseInt(numWDStr);
                result=compute();
                maxWDtext.setText(nf.format(result));
            }
            showStatus("");
        }catch (NumberFormatException exc){
            showStatus("Invalid Data");
            maxWDtext.setText("");
        }
    }
    double compute(){
        double b,e;
        double t1,t2;
        t1=rateofRet/numPerYear;
        b=(1+t1);
        e=numPerYear*numYears;
        t2=Math.pow(b,e)-1;
        return principal*(t1/t2+t1);
    }
}
